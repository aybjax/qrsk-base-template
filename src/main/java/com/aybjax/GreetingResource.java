package com.aybjax;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        invalidFunction("notNull");
        invalidFunction(null);
        return "Hello from Quarkus REST";
    }

    private void invalidFunction(String nonNullableString) {
        System.out.println(nonNullableString);
    }
}
