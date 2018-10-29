package com.qos.model.rest.facede;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.qos.model.model.ContasAPagar;
import com.qos.model.service.ContasAPagarService;

@Path("/contasAPagar")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class ContasAPagarFacede {
	
	@Inject
	private ContasAPagarService contasAPagarService;
	
	@GET
	public List<ContasAPagar> getContasAPagar(){
		return contasAPagarService.getContasAPagar();
	}
	
	@POST
	public ContasAPagar salvarContasAPagar(ContasAPagar contasAPagar) {
		return contasAPagarService.salvarContasAPagar(contasAPagar);
	}
	
	@PUT
	public ContasAPagar alterarContasAPagar(ContasAPagar contasAPagar) {
		contasAPagarService.alterarContasAPagar(contasAPagar);
		return contasAPagar;
	}
	
	@DELETE
	@Path("/{idContasAPagar}")
	public void excluir(@PathParam("idContasAPagar") Integer idContasAPagar) {
		ContasAPagar contasAPagar = new ContasAPagar();
		contasAPagar.setId(idContasAPagar);
		contasAPagarService.excluirContasAPagar(contasAPagar);
		
	}

}
