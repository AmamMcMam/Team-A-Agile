package com.kainos.ea.resources;

import com.kainos.ea.db.TestMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.kainos.ea.db.JobResponsibility;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.Reader;
import java.util.List;


@Path("/api")
public class WebService {
    private SqlSession sqlSession;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<? extends Object> testMyBatis(){
        if (sqlSession == null) {
            initDBConnection();
        }
        TestMapper jobRoles = sqlSession.getMapper(TestMapper.class);
        List<User> test = jobRoles.findAllUsers();
        return test;
    }

    @GET
    @Path("/job-roles")
    @Produces(MediaType.APPLICATION_JSON)
    public List<? extends Object> getJobRoles(){
        if (sqlSession == null) {
            initDBConnection();
        }
        TestMapper jobRoles = sqlSession.getMapper(TestMapper.class);
        List<Roles> roles = jobRoles.viewJobRoles();
        return roles;
    }

    @GET
    @Path("/job-roles/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<?extends Object> getJobResp(@PathParam("id") int id){
        if(sqlSession == null){
            initDBConnection();
        }
        JobResponsibility jobResponsibility = sqlSession.getMapper(JobResponsibility.class);
        List<JobResponsibilities> resps = jobResponsibility.getJobResp(id);
        return resps;
    }

    public void initDBConnection(){
        try (Reader settings = Resources.getResourceAsReader("mybatis-config.xml")) {
            SqlSessionFactoryBuilder mybatis = new SqlSessionFactoryBuilder();
            SqlSessionFactory mappedDb = mybatis.build(settings);
            sqlSession = mappedDb.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
