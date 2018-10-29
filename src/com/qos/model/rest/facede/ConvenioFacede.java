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

import com.qos.model.model.Convenio;
import com.qos.model.service.ConvenioService;

@Path("/convenios")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class ConvenioFacede {
	
	@Inject
	private ConvenioService convenioService;
	
	@GET
	public List<Convenio> getConvenios(){
		return convenioService.getConvenios();
	}
	
	@POST
	public Convenio salvarConvenio(Convenio convenio) {
		return convenioService.salvarConvenio(convenio);
	}
	
	@PUT
	public Convenio alterarConvenio(Convenio convenio) {
		convenioService.alterarConvenio(convenio);
		return convenio;
	}
	
	@DELETE
	@Path("/{idConvenio}")
	public void excluir(@PathParam("idConvenio") Integer idConvenio) {
		Convenio convenio = new Convenio();
		convenio.setId(idConvenio);
		convenioService.excluirConvenio(convenio);
		
	}
}
