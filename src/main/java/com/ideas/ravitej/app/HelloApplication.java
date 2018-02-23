package com.ideas.ravitej.app;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

public class HelloApplication extends ResourceConfig {
	public HelloApplication() {
        // Define the package which contains the resource classes.
        packages("com.ideas.ravitej.resources");
    }
}