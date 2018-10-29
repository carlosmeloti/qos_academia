package com.qos.model.dao;

import java.util.List;

import com.qos.model.model.Aluno;

public interface AlunoDaoInterface {
	
	Aluno salvarAluno(Aluno aluno); 
	void alterarAluno(Aluno aluno); 
	void excluirAluno(Aluno aluno);
	List<Aluno> getAlunos();

}
