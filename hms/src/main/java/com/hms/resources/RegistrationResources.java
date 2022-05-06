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

	/*
	 * Get all the Admin data.
	 */
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Admin> getAllAdmin() {
		return registrationService.findAllAdmin();
	}

	/*
	 * Add a new Admin user to the database.
	 */
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response addResponse(Admin admin) {
		registrationService.addAdmin(admin);
		return Response.status(Status.CREATED).entity(admin).build();
	}

	/*
	 * Authenticate the user Login and sends the response.
	 */
	@POST
	@Path("/login")
	@Consumes({ MediaType.APPLICATION_JSON })
	public Response checkLogin(Admin admin) {
		String Auth = registrationService.checkAdmin(admin);
		return Response.status(Status.OK).entity(Auth).build();
	}

}