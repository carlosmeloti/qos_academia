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

import com.qos.model.model.Matricula;
import com.qos.model.service.MatriculaService;

@Path("/matriculas")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class MatriculaFacede {
	
	@Inject
	private MatriculaService matriculaService;
	
	@GET
	public List<Matricula> getMatriculas(){
		return matriculaService.getMatriculas();
	}
	
	@POST
	public Matricula salvarMatricula(Matricula matricula) {
		return matriculaService.salvarMatricula(matricula);
	}
	
	@PUT
	public Matricula alterarMatricula(Matricula matricula) {
		matriculaService.alterarMatricula(matricula);
		return matricula;
	}
	
	@DELETE
	@Path("/{idMatricula}")
	public void excluir(@PathParam("idMatricula") Integer idMatricula) {
		Matricula matricula = new Matricula();
		matricula.setId(idMatricula);
		matriculaService.excluirMatricula(matricula);
		
	}

}
