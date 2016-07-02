package com.titanitestudios.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.titanitestudios.transaction.SankarBo;
import io.swagger.annotations.*;
import org.springframework.stereotype.Component;
import com.titanitestudios.transaction.TransactionBo;

@Component
@Path("/payment")
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "/payment", description="Payment API")
public class PaymentService {

	@Inject
	TransactionBo transactionBo;

	@Inject
	SankarBo sankarBo;

	@GET
	@Path("/save")
	public Response savePayment() {

		String result = transactionBo.save();

		return Response.status(200).entity(result).build();

	}

	@GET
	@Path("/hello")
	public Response hello() {

		String result = sankarBo.hello();

		return Response.status(200).entity(result).build();

	}

	@GET
	@Path("/jersey/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = "/jersey/{param}",
				  notes = "Test API to say hello to a person",
				  response = Response.class)
	@ApiResponses({
						   @ApiResponse(code = 404, message = "URL not found" ),
						   @ApiResponse( code = 200, message = "Saying hello to person" )
				   } )
	public Response getMsg(@ApiParam(value = "Message to say hello", required = true ) @PathParam("param") String msg)
	{
		String output = "Hello : " + msg;
		return Response.status(200).entity(output).build();
	}
}