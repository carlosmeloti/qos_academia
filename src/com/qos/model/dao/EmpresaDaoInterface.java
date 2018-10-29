package com.qos.model.dao;

import java.util.List;

import com.qos.model.model.Empresa;

public interface EmpresaDaoInterface {

	Empresa salvarEmpresa(Empresa empresa); 
	void alterarEmpresa(Empresa empresa);
	void excluirEmpresa(Empresa empresa);
	List<Empresa> getEmpresas();
}
