package com.test;

import java.util.Date;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("hello")
public class HelloService {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject sayHello(){
        return Json.createObjectBuilder().
                add("message", "Hello World!").
                add("time", new Date().toString()).
                build();
    }
    
}
