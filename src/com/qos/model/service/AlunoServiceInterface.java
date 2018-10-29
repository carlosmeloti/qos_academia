package com.qos.model.service;

import java.util.List;

import com.qos.model.model.Aluno;


public interface AlunoServiceInterface {
	
	Aluno salvarAluno(Aluno aluno); 
	void alterarAluno(Aluno aluno); 
	void excluirAluno(Aluno aluno);
	List<Aluno> getAlunos();


}
