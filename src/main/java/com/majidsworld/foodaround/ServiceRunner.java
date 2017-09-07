package com.majidsworld.foodaround;

import com.majidsworld.foodaround.health.ServiceHealthCheck;
import com.majidsworld.foodaround.resources.HealthCheckResource;
import com.majidsworld.foodaround.resources.TelegramUpdateResource;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import javax.ws.rs.client.Client;


public class ServiceRunner extends Application<FoodaroundConfiguration> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRunner.class);

    public static void main(String[] args) throws Exception {
        new ServiceRunner().run(args);
    }

    @Override
    public void run(FoodaroundConfiguration config, Environment e) throws Exception {
        LOGGER.info("Service has started!");
        final Client client = new JerseyClientBuilder().build();
        e.jersey().register(new TelegramUpdateResource());

        e.healthChecks().register("ServiceHealthCheck", new ServiceHealthCheck(client));
        e.jersey().register(new HealthCheckResource(e.healthChecks()));

    }


    @Override
    public void initialize(Bootstrap<FoodaroundConfiguration> b) {

    }
}
