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

import com.qos.model.model.Plano;
import com.qos.model.service.PlanoService;

@Path("/planos")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class PlanoFacede {

	@Inject
	private PlanoService planoService;
	
	@GET
	public List<Plano> getPlanos() {
		return planoService.getPlanos();
	}
	
	@POST
	public Plano salvarPlano(Plano plano) {
		return planoService.salvarPlano(plano);
	}
	
	@PUT
	public Plano alterarPlano(Plano plano) {
		planoService.alterarPlano(plano);
		return plano;
	}
	
	@DELETE
	@Path("/{idPlano}")
	public void excluir(@PathParam("idPlano") Integer idPlano) {
		Plano plano = new Plano();
		plano.setId(idPlano);
		planoService.excluirPlano(plano);
		
	}
	
}
