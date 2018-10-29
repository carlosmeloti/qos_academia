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

import com.qos.model.model.Treino;
import com.qos.model.service.TreinoService;

@Path("/treinos")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class TreinoFacede {
	
	@Inject
	private TreinoService treinoService;
	
	@GET
	public List<Treino> getTreinos() {
		return treinoService.getTreinos();
	}
	
	@POST
	public Treino salvarTreino(Treino treino) {
		return treinoService.salvarTreino(treino);
	}
	
	@PUT
	public Treino alterarTreino(Treino treino) {
		treinoService.alterarTreino(treino);
		return treino;
	}
	
	@DELETE
	@Path("/{idTreino}")
	public void excluir(@PathParam("idTreino") Integer idTreino) {
		Treino treino = new Treino();
		treino.setId(idTreino);
		treinoService.excluirTreino(treino);
		
	}

}
