package com.qos.model.service;

import java.util.List;

import com.qos.model.model.Fornecedor;

public interface FornecedorServiceInterface {

	Fornecedor salvarFornecedor(Fornecedor fornecedor); 
	void alterarFornecedor(Fornecedor fornecedor);
	void excluirFornecedor(Fornecedor fornecedor);
	List<Fornecedor> getFornecedores();
	
}
