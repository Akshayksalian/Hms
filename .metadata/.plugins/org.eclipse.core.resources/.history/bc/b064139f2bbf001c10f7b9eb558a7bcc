package com.hms.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.hms.entities.Candidates;
import com.hms.service.AdminService;

/*
 * 
 */
@Path("admin")
public class AdminResources {

	@Autowired
	private AdminService adminService;
	
	/*
	 * 
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON )
	public List<Candidates> getAdmins(){
		return adminService.getAllCandidates();
	}

	/*
	 * 
	 */
	@GET
	@Path("/{id}")
	@Produces( MediaType.APPLICATION_JSON)
	public Candidates getAdminById(@PathParam("id") int id) {
		System.out.println("I Am Object");
		return adminService.getCandidateById(id);
	}

}
