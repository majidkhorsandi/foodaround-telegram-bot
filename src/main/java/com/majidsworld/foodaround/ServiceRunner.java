package com.majidsworld.foodaround;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import java.util.stream.IntStream;


public class ServiceRunner extends Application<FoodaroundConfiguration> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceRunner.class);

    public static void main( String[] args ) throws Exception{
        new ServiceRunner().run(args);
    }

    @Override
    public void run(FoodaroundConfiguration config, Environment environment) throws Exception {
        LOGGER.info("Service has started!");
        IntStream.range(1,config.getMessageRepetitions())
                .forEach(num -> System.out.println(config.getMessage()));
    }

    @Override
    public void initialize(Bootstrap<FoodaroundConfiguration> b) {

    }
}
