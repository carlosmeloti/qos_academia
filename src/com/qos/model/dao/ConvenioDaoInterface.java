package com.qos.model.dao;

import java.util.List;

import com.qos.model.model.Convenio;


public interface ConvenioDaoInterface {

	Convenio salvarConvenio(Convenio convenio); 
	void alterarConvenio(Convenio convenio); 
	void excluirConvenio(Convenio convenio);
	List<Convenio> getConvenios();
	
}
