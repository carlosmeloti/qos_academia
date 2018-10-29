package com.qos.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import com.qos.model.dao.FornecedorDaoInterface;
import com.qos.model.model.Fornecedor;

public class FornecedorService implements FornecedorServiceInterface {

	@Inject
	private FornecedorDaoInterface fornecedorDaoInterface;

	@Override
	@Transactional
	public Fornecedor salvarFornecedor(Fornecedor fornecedor) {
		return fornecedorDaoInterface.salvarFornecedor(fornecedor);
		
	}

	@Override
	@Transactional
	public void alterarFornecedor(Fornecedor fornecedor) {
		fornecedorDaoInterface.alterarFornecedor(fornecedor);
		
	}

	@Override
	@Transactional
	public void excluirFornecedor(Fornecedor fornecedor) {
		fornecedorDaoInterface.excluirFornecedor(fornecedor);
		
	}

	@Override
	public List<Fornecedor> getFornecedores() {
		return fornecedorDaoInterface.getFornecedores();
	}

}
