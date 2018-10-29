package com.qos.model.service;

import java.util.List;

import com.qos.model.model.Convenio;

public interface ConvenioServiceInterface {
	
	Convenio salvarConvenio(Convenio convenio); 
	void alterarConvenio(Convenio convenio); 
	void excluirConvenio(Convenio convenio);
	List<Convenio> getConvenios();
}
