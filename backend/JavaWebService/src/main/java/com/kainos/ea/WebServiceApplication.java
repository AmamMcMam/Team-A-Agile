package com.kainos.ea;
import com.kainos.ea.controllers.BandsController;
import com.kainos.ea.controllers.JobRolesController;
import com.kainos.ea.db.BandMapper;
import com.kainos.ea.db.CapabilityMapper;
import com.kainos.ea.db.RoleMapper;
import com.kainos.ea.db.RolesMapper;
import com.kainos.ea.controllers.CapabilitiesController;
import com.kainos.ea.services.CapabilitiesService;
import com.kainos.ea.services.BandService;
import com.kainos.ea.services.RoleService;
import com.kainos.ea.controllers.*;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class WebServiceApplication extends Application<WebServiceConfiguration> {
    private SqlSession sqlSession;

    public static void main(final String[] args) throws Exception {
        new WebServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "WebService";
    }

    @Override
    public void initialize(final Bootstrap<WebServiceConfiguration> bootstrap) {
    }

    @Override
    public void run(final WebServiceConfiguration configuration,
                    final Environment environment) {
        // SQL configuration
        try (Reader settings = Resources.getResourceAsReader("mybatis-config.xml")) {
            SqlSessionFactoryBuilder mybatis = new SqlSessionFactoryBuilder();
            SqlSessionFactory mappedDb = mybatis.build(settings);
            sqlSession = mappedDb.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Register resources
        RolesMapper rolesMapper = sqlSession.getMapper(RolesMapper.class);
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        BandMapper bandMapper = sqlSession.getMapper(BandMapper.class);
        CapabilityMapper capabilityMapper = sqlSession.getMapper(CapabilityMapper.class);


        RoleService rolesService = new RoleService(rolesMapper, roleMapper);
        BandService bandService = new BandService(roleMapper, bandMapper);
        CapabilitiesService capabilityService = new CapabilitiesService(capabilityMapper);

        environment.jersey().register(new BandsController(bandService));
        environment.jersey().register(new JobRolesController(rolesService));
        environment.jersey().register(new CapabilitiesController(capabilityService));

    }
}
