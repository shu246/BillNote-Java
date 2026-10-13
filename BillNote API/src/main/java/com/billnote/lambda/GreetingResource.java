package com.billnote.lambda;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/test")
public class GreetingResource  {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String, String> testApi() {
		Map<String, String> responce = new HashMap<>();
		responce.put("status", "success");
		responce.put("message", "Java21 & Quarkus API is working!");
		return responce;
	}
	
}