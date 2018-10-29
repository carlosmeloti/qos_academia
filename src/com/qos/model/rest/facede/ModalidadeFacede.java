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
import com.qos.model.model.Modalidade;
import com.qos.model.service.ModalidadeService;

@Path("/modalidades")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class ModalidadeFacede {

	@Inject
	private ModalidadeService modalidadeService;
	
	@GET
	public List<Modalidade> getModalidades() {
		return modalidadeService.getModalidades();
	}
	
	@POST
	public Modalidade salvarModalidade(Modalidade modalidade) {
		return modalidadeService.salvarModalidade(modalidade);
	}
	
	@PUT
	public Modalidade alterarModalidade(Modalidade modalidade) {
		modalidadeService.alterarModalidade(modalidade);
		return modalidade;
	}
	
	@DELETE
	@Path("/{idModalidade}")
	public void excluir(@PathParam("idModalidade") Integer idModalidade) {
		Modalidade modalidade = new Modalidade();
		modalidade.setId(idModalidade);
		modalidadeService.excluirModalidade(modalidade);
		
	}
}
