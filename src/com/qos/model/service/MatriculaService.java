package com.qos.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.qos.model.dao.MatriculaDaoInterface;

import com.qos.model.model.Matricula;

public class MatriculaService implements MatriculaServiceInterface{

	@Inject
	private MatriculaDaoInterface matriculaDaoInterface;

	@Override
	@Transactional
	public Matricula salvarMatricula(Matricula matricula) {
		return matriculaDaoInterface.salvarMatricula(matricula);
	}

	@Override
	@Transactional
	public void alterarMatricula(Matricula matricula) {
		matriculaDaoInterface.alterarMatricula(matricula);
		
	}

	@Override
	@Transactional
	public void excluirMatricula(Matricula matricula) {
		matriculaDaoInterface.excluirMatricula(matricula);
		
	}

	@Override
	public List<Matricula> getMatriculas() {
		return matriculaDaoInterface.getMatriculas();
	}

	
}
