package com.test.distributionservice.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Handles requests for the DistributionService.
 */

@Path("/distribution-service")
public class DistributionServiceRestController {

	@GET
	@Path("/ping")
	@Produces(MediaType.TEXT_PLAIN)
	public String ping() {
		return "Yes, I am alive. Current time is: " + new Date().toString();
	}

	
}
