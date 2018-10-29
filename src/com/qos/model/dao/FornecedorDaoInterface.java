package com.qos.model.dao;

import java.util.List;

import com.qos.model.model.Fornecedor;


public interface FornecedorDaoInterface {
	
	Fornecedor salvarFornecedor(Fornecedor fornecedor); 
	void alterarFornecedor(Fornecedor fornecedor);
	void excluirFornecedor(Fornecedor fornecedor);
	List<Fornecedor> getFornecedores();

}
