package com.qos.model.rest.facede;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.qos.model.service.EmpresaService;
import com.qos.model.model.Empresa;

@Path("/empresas")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON})
public class EmpresaFacede {
	
	@Inject
	private EmpresaService empresaService;
	
	@GET
	public List<Empresa> getEmpresas() {
		return empresaService.getEmpresas();
	}
	
	@POST
	public Empresa salvarEmpresa(Empresa empresa) {
		return empresaService.salvarEmpresa(empresa);
	}
	
	@PUT
	public Empresa alterarEmpresa(Empresa empresa) {
		empresaService.alterarEmpresa(empresa);
		return empresa;
	}
	
	@DELETE
	@Path("/{idEmpresa}")
	public void excluir(@PathParam("idEmpresa") Integer idEmpresa) {
		Empresa empresa = new Empresa();
		empresa.setId(idEmpresa);
		empresaService.excluirEmpresa(empresa);
		
	}

}
