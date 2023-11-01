package br.com.fiap.technobike.model.controller;

import java.util.ArrayList;

import br.com.fiap.technobike.model.entity.DadosVistoria;
import br.com.fiap.technobike.model.repository.VistoriaRepository;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;

@Path("/technobike")
public class VistoriaResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll() {
		ArrayList<DadosVistoria> resposta = VistoriaRepository.findAll();
		ResponseBuilder response = Response.ok();
		response.entity(resposta);
		return response.build();
}
	
	
}
