package com.kainos.ea.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
public class BandsController {
    private BandService service;

    public BandsController(BandService service){
        this.service = service;
    }

    @GET
    @Path("/bands")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Band> getBands () {
        return service.getBands();
    }
    @GET
    @Path("/bands/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Band getBand (@PathParam("id") int bandID) {
       return service.getBand(bandID);
    }

    @GET
    @Path("/bands/{id}/competency")
    @Produces(MediaType.APPLICATION_JSON)
    public List<CompetencyElement> getCompetencyPerBand (@PathParam("id") int bandID)
    {
        return service.getCompetencyPerBand(bandID);
    }

}
