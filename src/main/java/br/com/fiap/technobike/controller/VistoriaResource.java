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
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;

/***
 * Classe para implementar as requisições de GET e POST para a API
 * @author luizfillipe
 * @version 3.0
 */

@Path("/technobike")
public class VistoriaResource {
	/***
	 * Método para encontrar todos os clientes através do GET
	 * @author luizfillipe
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll() {
		ArrayList<DadosVistoria> resposta = VistoriaRepository.findAll();
		ResponseBuilder response = Response.ok();
		response.entity(resposta);
		return response.build();
		
}
	/***
	 * Método para encontrar os clientes através do cpf com um endpoint terminado com o cpf buscado utilizando GET
	 * @author luizfillipe
	 * @return codigo do status de funcionamento
	 */

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{cpf}")
	public Response findAll(@PathParam("cpf") String cpf) {
		ArrayList<DadosVistoria> resposta = VistoriaRepository.findOne(cpf);
		  if (resposta != null && !resposta.isEmpty()) {
	            System.out.println("Cpf encontrado");
	            ResponseBuilder response = Response.ok(resposta, MediaType.APPLICATION_JSON);
	            return response.build();
	        } else {
	        	System.out.println("Cliente não encontrado");
	            ResponseBuilder response = Response.status(404);
	            return response.build();
	        }
		
}
	/***
	 * Método para adicionar os dados necessários para a vistoria utilizando POST
	 * @author luizfillipe
	 */
	
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
	
	/***
	 * Método para armazenar as notas do feedbac
	 * @author luizfillipe
	 */
	@POST
	@Path("/feedback")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveFb(@Valid Feedback feedback) {
		Feedback resposta = VistoriaRepository.saveFb(feedback);
		if (resposta == null) {
	        return Response.status(400).build();
	    } else {
	        return Response.created(null).entity(resposta).build();
	    }
	}
	
}
