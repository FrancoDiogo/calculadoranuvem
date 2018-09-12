package br.com.db1.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import br.com.db1.dao.CalculadoraSimplesDao;


@Path("/calculadora")
public class CalculadoraRest {
	
	CalculadoraSimplesDao dao = new CalculadoraSimplesDao();
	
	@POST
	@Path("dividir/{param}/{param2}")
	public Response dividir(@PathParam("param") Double valor1, @PathParam("param2") Double valor2) {
		Double result = dao.dividir(valor1, valor2);
		return Response.status(200).entity("Resultado Calculadora Power: " + result).build();
	}
	
	/*@GET
	@Path("multiplicar/{param}/{param2}")
	public Response multiplicar(@PathParam("param") Double valor1, @PathParam("param2") Double valor2) {
		Double result = dao.multiplicar(valor1, valor2);
		return Response.status(200).entity("Resultado Calculadora Power: " + result).build();
	}
	
	@GET
	@Path("somar/{param}/{param2}")
	public Response somar(@PathParam("param") Double valor1, @PathParam("param2") Double valor2) {
		Double result = dao.somar(valor1, valor2);
		return Response.status(200).entity("Resultado Calculadora Power: " + result).build();
	}
	
	@GET
	@Path("subtrair/{param}/{param2}")
	public Response subtrair(@PathParam("param") Double valor1, @PathParam("param2") Double valor2) {
		Double result = dao.subtrair(valor1, valor2);
		return Response.status(200).entity("Resultado Calculadora Power: " + result).build();
	}*/

}