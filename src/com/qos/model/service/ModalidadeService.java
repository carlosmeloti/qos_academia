package com.qos.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.qos.model.dao.ModalidadeDaoInterface;
import com.qos.model.model.Modalidade;

public class ModalidadeService implements ModalidadeServiceInterface {
	
	@Inject
	private ModalidadeDaoInterface modalidadeDaoInterface;

	@Override
	@Transactional
	public Modalidade salvarModalidade(Modalidade modalidade) {
		
		return modalidadeDaoInterface.salvarModalidade(modalidade);
	}

	@Override
	@Transactional
	public void alterarModalidade(Modalidade modalidade) {
		modalidadeDaoInterface.alterarModalidade(modalidade);
		
	}

	@Override
	@Transactional
	public void excluirModalidade(Modalidade Modalidade) {
		modalidadeDaoInterface.excluirModalidade(Modalidade);
		
	}

	@Override
	public List<Modalidade> getModalidades() {
		
		return modalidadeDaoInterface.getModalidades();
	}

}
