package com.qos.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import com.qos.model.dao.AlunoDaoInterface;
import com.qos.model.model.Aluno;

public class AlunoService implements AlunoServiceInterface{
	

	@Inject
	private AlunoDaoInterface alunoDaoInterface;

	@Override
	@Transactional
	public Aluno salvarAluno(Aluno aluno) {
		
		return alunoDaoInterface.salvarAluno(aluno);
	}

	@Override
	@Transactional
	public void alterarAluno(Aluno aluno) {
		alunoDaoInterface.alterarAluno(aluno);
		
	}

	@Override
	@Transactional
	public void excluirAluno(Aluno aluno) {
		alunoDaoInterface.excluirAluno(aluno);
		
	}

	@Override
	public List<Aluno> getAlunos() {
		
		return alunoDaoInterface.getAlunos();
	}

}
