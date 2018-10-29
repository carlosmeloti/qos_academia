package com.qos.model.service;

import java.util.List;

import com.qos.model.model.Matricula;

public interface MatriculaServiceInterface {

	Matricula salvarMatricula(Matricula convenio); 
	void alterarMatricula(Matricula convenio); 
	void excluirMatricula(Matricula convenio);
	List<Matricula> getMatriculas();
	
}
