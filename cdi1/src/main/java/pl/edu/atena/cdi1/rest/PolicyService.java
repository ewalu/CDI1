package pl.edu.atena.cdi1.rest;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pl.edu.atena.cd1.calculation.StandardCalculation;
import pl.edu.atena.cdi1.Policy;

@Path("/policy")
public class PolicyService {
	
	@Inject
	private StandardCalculation calculation;
	
	private Logger log = Logger.getLogger("PolicyService");
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response calculate(Policy policy) {
		
		policy = calculation.calculate(policy);
		
		log.info(policy.toString());
		return Response.ok().entity(policy).build();
	}

}
