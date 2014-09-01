package com.nisum.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nisum.rest.service.CountryService;

@Component
@Path("/payment")
public class Processor {

	@Autowired
	CountryService countryService;

	@GET
	@Path("/save")
	@Produces(MediaType.APPLICATION_JSON)
	public Response savePayment(
			@QueryParam(value = "countryName") String countryName,
			@QueryParam(value = "population") String population,
			@QueryParam(value = "city") String city) {
		return Response.status(200)
				.entity(countryService.save(countryName, population, city))
				.build();
	}

	@GET
	@Path("/read")
	@Produces(MediaType.APPLICATION_JSON)
	public String read() {
		return countryService.read();

	}

	@GET
	@Path("/readbyname")
	@Produces(MediaType.APPLICATION_JSON)
	public String readByName(@QueryParam(value = "name") String name) {
		return countryService.readByName(name);

	}

}