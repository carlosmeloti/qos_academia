package com.qos.model.service;

import java.util.List;

import com.qos.model.model.Modalidade;

public interface ModalidadeServiceInterface {
	
	Modalidade salvarModalidade(Modalidade modalidade); 
	void alterarModalidade(Modalidade modalidade); 
	void excluirModalidade(Modalidade Modalidade);
	List<Modalidade> getModalidades();

}
