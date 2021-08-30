package com.kainos.ea.resources;

import com.kainos.ea.db.RoleMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class JobSpecificationController {
    private JobSpecificationService service;

    public JobSpecificationController(JobSpecificationService service){
        this.service = service;
    }

    @GET
    @Path("/job-roles/job-spec/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public JobSpecification getJobSpecification(@PathParam("id") int roleID) {
        return service.getJobSpecification(roleID);
    }
}