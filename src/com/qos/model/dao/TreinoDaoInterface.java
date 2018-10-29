package com.qos.model.dao;

import java.util.List;

import com.qos.model.model.Treino;

public interface TreinoDaoInterface {
	
	Treino salvarTreino(Treino treino); 
	void alterarTreino(Treino treino); 
	void excluirTreino(Treino treino);
	List<Treino> getTreinos();

}
