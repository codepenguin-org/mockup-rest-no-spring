/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.codepenguin.mockup.rest.nospring;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author jorgealfonso
 */
@Path("mockup-login")
public class MockupLoginResource {

    private static final Logger LOG = Logger.getLogger(MockupLoginResource.class.getName());

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getJson(LoginInput input) {
        LOG.log(Level.INFO, "input = {0}", input);
        if (!input.getUsername().equalsIgnoreCase("juanito") || !input.getPassword().equals("123456")) {
            return Response.status(Response.Status.UNAUTHORIZED).entity(new LoginOutput("No te conozco!")).build();
        }

        return Response.ok(new LoginOutput("OK")).build();
    }
}
