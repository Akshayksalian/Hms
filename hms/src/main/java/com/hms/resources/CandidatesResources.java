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
import com.hms.service.InterviewersService;

/*
 * 
 */
@Path("candidates")
public class CandidatesResources {

	@Autowired
	private CandidatesService candidatesService;
	
	@Autowired
	private InterviewersService interviewersService;
	
	/*
	 * Get Candidate Detail By Id.
	 */
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Candidates getCandidatesById(@PathParam("id") int id) {
		return candidatesService.findCandidateById(id);
	}
	

	/*
	 * Fetch data from the CSV file.
	 */
	@GET
	@Path("/fetchData")
	public void fetchFromCsv() {
		candidatesService.fetchCandidates();
		interviewersService.fetchInterviewers();
	}

	/*
	 * Get Candidate by there domain id.
	 */
	@GET
	@Path("/domain/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Candidates> getCandidatesByDomainId(@PathParam("id") int id) {
		return candidatesService.findByDomainId(id);
	}

	@GET
	@Path("/hired/{id}")
	public void updateHire(@PathParam("id") int id) {
		 candidatesService.updateHire(id);
	}
	
	@GET
	@Path("/reject/{id}")
	public void updateReject(@PathParam("id") int id) {
		 candidatesService.updateReject(id);
	}
	
	/*
	 * Updating the existing candidates questionnaire details.
	 */
	@PUT
	@Path("/que")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response updateCandidateResponse(Candidates candidates) {
		Candidates c = candidatesService.updateCandidatesQuestionnaires(candidates);
		return Response.status(Status.OK).entity(c).build();
	}

	/*
	 * Updated Candidates feedback.
	 */
	@PUT
	@Path("/feedback")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response updateCandidateFeedback(Candidates candidates) {
		Candidates c = candidatesService.updateCandidatesFeedback(candidates);
		return Response.status(Status.OK).entity(c).build();
	}

	/*
	 * Delete Candidate based on the id provided.
	 */
	@DELETE
	@Path("/{id}")
	@Produces({ MediaType.APPLICATION_JSON })
	public Response deleteResponse(@PathParam("id") int id) {
		candidatesService.deleteCandidates(id);
		return Response.status(Status.OK).entity("Deleted Succesfuly").build();
	}

//	/*
//	 * All the Candidates details will be displayed.
//	 */
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<Candidates> getCandidates() {
//		return candidatesService.findAllCandidates();
//	}

}
