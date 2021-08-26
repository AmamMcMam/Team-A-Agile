package com.kainos.ea.resources;

import com.kainos.ea.db.BandMapper;
import com.kainos.ea.db.TestMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

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
    @Path("/job-roles/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Band getRolePerBand(@PathParam("id") int roleID){
        if (sqlSession == null) {
            initDBConnection();
        }
        BandMapper roleBand = sqlSession.getMapper(BandMapper.class);
        Band band = roleBand.getRolePerBand(roleID);
        return band;
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
