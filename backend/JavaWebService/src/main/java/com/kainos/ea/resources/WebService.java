package com.kainos.ea.resources;

import com.kainos.ea.db.RoleMapper;
import com.kainos.ea.db.RolesMapper;
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

//    @GET
//    @Path("/")
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<? extends Object> testMyBatis(){
//    }

    @GET
    @Path("/job-roles")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Roles> getJobRoles(){
        if (sqlSession == null) {
            initDBConnection();
        }
        RolesMapper jobRoles = sqlSession.getMapper(RolesMapper.class);
        List<Roles> roles = jobRoles.viewJobRoles();
        return roles;
    }

    @GET
    @Path("/job-roles/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Roles getRole (@PathParam("id") int roleID) {
        if (sqlSession == null) {
            initDBConnection();
        }
        RoleMapper jobRole = sqlSession.getMapper(RoleMapper.class);
        Roles role = jobRole.getRole(roleID);
        return role;
    }

    @GET
    @Path("/bands/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Band getBand (@PathParam("id") int bandID) {
        if (sqlSession == null) {
            initDBConnection();
        }
        RoleMapper jobRole = sqlSession.getMapper(RoleMapper.class);
        Band band = jobRole.getBand(bandID);
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
