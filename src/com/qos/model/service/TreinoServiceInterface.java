package com.qos.model.service;

import java.util.List;

import com.qos.model.model.Treino;

public interface TreinoServiceInterface {

	Treino salvarTreino(Treino treino); 
	void alterarTreino(Treino treino); 
	void excluirTreino(Treino treino);
	List<Treino> getTreinos();
}
