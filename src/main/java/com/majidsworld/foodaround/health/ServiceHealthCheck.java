package com.majidsworld.foodaround.health;

import com.codahale.metrics.health.HealthCheck;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

public class ServiceHealthCheck extends HealthCheck {
    private final Client client;

    public ServiceHealthCheck(Client client) {
        this.client = client;
    }

    @Override
    protected Result check() throws Exception {
        WebTarget webTarget = client.target("http://localhost:80/health");
        Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.get();
        @SuppressWarnings("rawtypes")
        boolean result = response.readEntity(Boolean.class);
        if(result){
            return Result.healthy();
        }
        return Result.unhealthy("API Failed");
    }
}