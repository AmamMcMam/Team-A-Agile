package com.kainos.ea;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

public class WebServiceConfiguration extends Configuration {

    private SwaggerBundleConfiguration swaggerBundleConfiguration;

    public SwaggerBundleConfiguration getSwagger(){
        return swaggerBundleConfiguration;
    }

    public void setSwagger(SwaggerBundleConfiguration swagger) {
        this.swaggerBundleConfiguration = swagger;
    }
}
