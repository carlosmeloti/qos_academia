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

import com.qos.model.model.Aluno;
import com.qos.model.service.AlunoService;

@Path("/alunos")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class AlunoFacede {
	
	@Inject
	private AlunoService alunoService;
	
	@GET
	public List<Aluno> getAlunos(){
		return alunoService.getAlunos();
	}
	
	@POST
	public Aluno salvarAluno(Aluno aluno) {
		return alunoService.salvarAluno(aluno);
	}
	
	@PUT
	public Aluno alterarAluno(Aluno aluno) {
		alunoService.alterarAluno(aluno);
		return aluno;
	}
	
	@DELETE
	@Path("/{idAluno}")
	public void excluir(@PathParam("idAluno") Integer idAluno) {
		Aluno aluno = new Aluno();
		aluno.setId(idAluno);
		alunoService.excluirAluno(aluno);
		
	}

}
