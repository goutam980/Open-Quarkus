package com.lw.tech;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/home")
public class HelloLW {
    @Path("/a1")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {

        return "Hello this is goutam patwari";
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/a2")

    public String hell() {
        return "Hello this is goutam tiwari";
    }
}
