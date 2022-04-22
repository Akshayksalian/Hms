package com.hms.resources;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.hms.entities.Admin;
import com.hms.service.RegistrationService;

@Path("/reg")
public class RegistrationResources {
	
	@Autowired
	private RegistrationService registrationService;
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Admin> getAllAdmin() {
		return registrationService.findAllAdmin();
	}
	
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response addResponse(Admin admin) {
		registrationService.addAdmin(admin);
		return Response.status(Status.CREATED).entity(admin).build();
	}

}