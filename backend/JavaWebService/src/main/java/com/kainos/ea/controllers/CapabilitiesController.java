package com.kainos.ea.controllers;

import com.kainos.ea.models.Capability;
import com.kainos.ea.models.Role;
import com.kainos.ea.services.CapabilitiesService;
import io.swagger.annotations.Api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Api
@Path("/api")
public class CapabilitiesController {
    private CapabilitiesService service;

    public CapabilitiesController(CapabilitiesService service){
        this.service = service;
    }

    @GET
    @Path("/capabilities")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Capability> getCapabilities(){
        return service.getCapabilities();
    }

    @GET
    @Path("/capabilities/{capabilityId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Role> getRolesForCapability(@PathParam("capabilityId") int capabilityId){
        return service.rolesPerCapability(capabilityId);
    }
}
