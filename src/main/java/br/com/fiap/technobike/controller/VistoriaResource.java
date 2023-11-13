package br.com.fiap.technobike.controller;

import java.util.ArrayList;

import br.com.fiap.technobike.model.entity.DadosVistoria;
import br.com.fiap.technobike.model.entity.Feedback;
import br.com.fiap.technobike.model.repository.VistoriaRepository;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
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
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(@Valid DadosVistoria dado) {
		DadosVistoria resposta = VistoriaRepository.update(dado);
		ResponseBuilder response = null;
		if(resposta == null) {
			response = Response.created(null);
		}
		else {
			response = Response.status(400);
		}
		response.entity(resposta);
		return response.build();
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(@Valid DadosVistoria dado) {
		DadosVistoria resposta = VistoriaRepository.save(dado);
		ResponseBuilder response = null;
		if(resposta == null) {
			response = Response.created(null);
		}
		else {
			response = Response.status(400);
		}
		response.entity(resposta);
		return response.build();
	}
	@POST
	@Path("/feedback")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveFb(@Valid Feedback feedback) {
		DadosVistoria dado = new DadosVistoria();
		Feedback resposta = VistoriaRepository.saveFb(dado, feedback);
		if (resposta == null) {
	        return Response.status(400).build();
	    } else {
	        return Response.created(null).entity(resposta).build();
	    }
	}
	
}
