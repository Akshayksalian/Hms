package com.hms.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;

import com.hms.entities.Candidates;
import com.hms.service.CandidatesService;

/*
 * 
 */
@Path("candidates")
public class CandidatesResources {

	@Autowired
	private CandidatesService candidatesService;

	/*
	 * All the Candidates details will be displayed.
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Candidates> getCandidates() {
//			candidatesService.fetchCandidates();
		return candidatesService.findAllCandidates();
	}

	/*
	 * Fetches Candidate Detail By Id.
	 */
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Candidates getCandidatesById(@PathParam("id") int id) {
		System.out.println("I Am Object");
		return candidatesService.findCandidateById(id);
	}
	
	@GET
	@Path("/domain/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Candidates> getCandidatesByDomainId(@PathParam("id") int id){
		return candidatesService.findByDomainId(id);
	}

//	/*
//	 * New Candidates can be added.
//	 */
//	@POST
//	@Path("/addCandidates")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response addCandidatesResponse(Candidates candidates) {
//		candidatesService.addCandidates(candidates);
//		return Response.status(Status.CREATED).entity(candidates).build();
//	}

	/*
	 * Updating the existing candidates details
	 */
	@PUT
	@Path("/que")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response updateCandidateResponse(Candidates candidates) {
		Candidates c = candidatesService.updateCandidatesQuestionnaires(candidates);
		return Response.status(Status.OK).entity(c).build();
	}

	@DELETE
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response deleteResponse(@PathParam("id") int id) {
		candidatesService.deleteCandidates(id);
		return Response.status(Status.OK).entity("Deleted Succesfuly").build();
	}
}
