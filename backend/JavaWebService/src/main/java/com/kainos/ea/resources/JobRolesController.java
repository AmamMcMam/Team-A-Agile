package com.kainos.ea.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
public class JobRolesController {
    private RoleService service;

    public JobRolesController(RoleService service){
        this.service = service;
    }

    @GET
    @Path("/job-roles")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Role> getJobRoles(){
        return service.getRoles();
    }

    @GET
    @Path("/job-roles/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Role getRole (@PathParam("id") int roleID) {return service.getRole(roleID);}
}
