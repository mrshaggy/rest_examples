/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiddcorp;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author jkidd
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of com.kiddcorp.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/html")
    // @Path("/things/{id: \\d+}")
    @Path("/things/{id: \\d+}")
    public String x1(@PathParam("id") Integer id) {
        return "Hello World Intger: " + id;
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     *
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @GET
    @Produces("text/html")
    @Path("/things/{id: [1-9A-Za-z]+}")
    public String x2(@PathParam("id") String id) {
        return "Hello World String2: " + id;
    }
}
