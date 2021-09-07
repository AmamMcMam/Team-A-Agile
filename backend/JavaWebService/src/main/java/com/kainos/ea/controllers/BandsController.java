package com.kainos.ea.controllers;

import com.kainos.ea.models.Band;
import com.kainos.ea.services.BandService;
import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Api
@Path("/api")
public class BandsController {
    private BandService service;

    public BandsController(BandService service){
        this.service = service;
    }

    @GET
    @Path("/bands/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Band getBand (@PathParam("id") int bandID) {
       return service.getBand(bandID);
    }
}
