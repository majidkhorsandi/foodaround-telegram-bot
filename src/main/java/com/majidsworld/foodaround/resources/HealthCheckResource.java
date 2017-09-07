package com.majidsworld.foodaround.resources;

import com.codahale.metrics.health.HealthCheckRegistry;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Path("/health")
public class HealthCheckResource {

    private HealthCheckRegistry registry;

    public HealthCheckResource(HealthCheckRegistry registry) {
        this.registry = registry;
    }

    @GET
    public boolean getStatus(){
        //todo(majid): implement a real health check here.
        return true;
    }
}
