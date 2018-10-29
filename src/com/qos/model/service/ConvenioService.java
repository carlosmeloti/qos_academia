package com.qos.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.qos.model.dao.ConvenioDaoInterface;
import com.qos.model.model.Convenio;

public class ConvenioService implements ConvenioServiceInterface{

	@Inject
	private ConvenioDaoInterface convenioDaoInterface;

	@Override
	@Transactional
	public Convenio salvarConvenio(Convenio convenio) {
		return convenioDaoInterface.salvarConvenio(convenio);
	}

	@Override
	@Transactional
	public void alterarConvenio(Convenio convenio) {
		convenioDaoInterface.alterarConvenio(convenio);
		
	}

	@Override
	@Transactional
	public void excluirConvenio(Convenio convenio) {
		convenioDaoInterface.excluirConvenio(convenio);
		
	}

	@Override
	public List<Convenio> getConvenios() {
		return convenioDaoInterface.getConvenios();
	}

	
}
