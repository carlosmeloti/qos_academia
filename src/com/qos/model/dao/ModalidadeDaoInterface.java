package com.qos.model.dao;

import java.util.List;

import com.qos.model.model.Modalidade;

public interface ModalidadeDaoInterface {

	Modalidade salvarModalidade(Modalidade modalidade); 
	void alterarModalidade(Modalidade modalidade); 
	void excluirModalidade(Modalidade Modalidade);
	List<Modalidade> getModalidades();

	
}
