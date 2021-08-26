package com.kainos.ea;
import com.kainos.ea.resources.WebService;
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
        // TODO: implement application
        environment.jersey().register(new WebService());

    }

}