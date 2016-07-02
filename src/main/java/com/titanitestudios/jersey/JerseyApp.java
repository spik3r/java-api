package com.titanitestudios.jersey;

import org.glassfish.jersey.server.ResourceConfig;
import io.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class JerseyApp extends ResourceConfig {

    private static final String RESOURCE_PACKAGE            = "com.titanitestudios.rest";
    private static final String SWAGGER_PROVIDER_PACKAGEDER_PACKAGE = "io.swagger.jaxrs.listing";

    public JerseyApp() {

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setResourcePackage(RESOURCE_PACKAGE);
        beanConfig.setBasePath("/");
        beanConfig.setTitle("REST API");

        beanConfig.setScan(true);

        packages(RESOURCE_PACKAGE, SWAGGER_PROVIDER_PACKAGEDER_PACKAGE);
    }
}