package com.ideas.ravitej.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
 
@Path("/howareyou")
public class HowAreYouResource {

  @GET
  @Path("/{name}")
  public String sayHello(@PathParam("name") String name) {
    String output = "How are you " +name+"? asks Jersey REST Service.";
    return output;
  }
}