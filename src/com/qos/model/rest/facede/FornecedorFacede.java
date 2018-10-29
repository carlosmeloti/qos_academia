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

import com.qos.model.model.Fornecedor;
import com.qos.model.service.FornecedorService;

@Path("/fornecedores")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class FornecedorFacede {

	@Inject
	private FornecedorService fornecedorService;
	
	@GET
	public List<Fornecedor> getFornecedores(){
		return fornecedorService.getFornecedores();
	}
	
	@POST
	public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
		return fornecedorService.salvarFornecedor(fornecedor);
	}
	
	@PUT
	public Fornecedor alterarFornecedor(Fornecedor fornecedor) {
		fornecedorService.alterarFornecedor(fornecedor);
		return fornecedor;
	}
	
	@DELETE
	@Path("/{idFornecedor}")
	public void excluir(@PathParam("idFornecedor") Integer idFornecedor) {
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setId(idFornecedor);
		fornecedorService.excluirFornecedor(fornecedor);
		
	}
	
	
}
