package com.qos.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.qos.model.dao.ContasAPagarDaoInterface;
import com.qos.model.model.ContasAPagar;

public class ContasAPagarService implements ContasAPagarServiceInterface {
	
	@Inject
	private ContasAPagarDaoInterface contasAPagarDaoInterface;

	@Override
	@Transactional
	public ContasAPagar salvarContasAPagar(ContasAPagar contasAPagar) {
		
		return contasAPagarDaoInterface.salvarContasAPagar(contasAPagar);
	}

	@Override
	@Transactional
	public void alterarContasAPagar(ContasAPagar contasAPagar) {
		contasAPagarDaoInterface.alterarContasAPagar(contasAPagar);
		
	}

	@Override
	@Transactional
	public void excluirContasAPagar(ContasAPagar contasAPagar) {
		contasAPagarDaoInterface.excluirContasAPagar(contasAPagar);
		
	}

	@Override
	public List<ContasAPagar> getContasAPagar() {
		
		return contasAPagarDaoInterface.getContasAPagar();
	}
	
	

}
