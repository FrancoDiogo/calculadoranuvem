package br.com.db1.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import br.com.db1.dao.CalculadoraSimplesDao;


@Path("/calcula")
public class CalculadoraRest {
	
	CalculadoraSimplesDao dao = new CalculadoraSimplesDao();
	
	@GET
	@Path("dividir/{param}/{param2}")
	public Response calcular(@PathParam("param") Integer valor1, @PathParam("param2") Integer valor2) {
		Integer result = dao.dividir(valor1, valor2);
		return Response.status(200).entity(result).build();
	}
}
