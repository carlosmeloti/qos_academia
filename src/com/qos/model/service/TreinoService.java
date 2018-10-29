package com.qos.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.qos.model.dao.TreinoDaoInterface;
import com.qos.model.model.Treino;

public class TreinoService implements TreinoServiceInterface {
	
	@Inject
	private TreinoDaoInterface treinoDaoInterface;

	@Override
	@Transactional
	public Treino salvarTreino(Treino treino) {
		
		return treinoDaoInterface.salvarTreino(treino);
	}

	@Override
	@Transactional
	public void alterarTreino(Treino treino) {
		treinoDaoInterface.alterarTreino(treino);
		
	}

	@Override
	@Transactional
	public void excluirTreino(Treino treino) {
		treinoDaoInterface.excluirTreino(treino);
		
	}

	@Override
	public List<Treino> getTreinos() {
		
		return treinoDaoInterface.getTreinos();
	}

}
