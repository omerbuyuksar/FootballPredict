/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.footballpredict.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Ömer Faruk Büyükşar
 */
@Path("/")
public class GetPredicts {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response isAlive() {
        return Response.ok().entity("I AM ALIVE").build();
    }
    
}
