package com.ideas.ravitej.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
 
@Path("/")
public class DefaultResource {

  @GET
  public String defaultMethod() {
    String output = "Welcome to my Webservice!";
    return output;
  }
}