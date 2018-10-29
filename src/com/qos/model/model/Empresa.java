package com.qos.model.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table(name="empresa")
public class Empresa implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id //Indica chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Gera codigo automatico
	@Column(name="emp_id")
	private long id;
	
	@Column(name="emp_razaoSocial", length=50, nullable=false)
	private String razaoSocial;
	
	@Column(name="emp_nomeFantasia", length=50, nullable=false)
	private String nomeFantasia;
	
	@Column(name="emp_nomeResponsavel", length=50, nullable=true)
	private String nomeResponsavel;
	
	@Column(name="emp_cnpj", length=50, nullable=true)
	private String cnpj;
	
	@Column(name="emp_email", length=50, nullable=true)
	private String email;
	
	@Column(name="emp_telefone", length=50, nullable=true)
    private String telefone;
	
	@Column(name="emp_celular", length=50, nullable=true)
    private String celular;
	
	@Column(name="emp_endereco", length=50, nullable=true)
	private String endereco;
	    
	@Column(name="emp_bairro", length=50, nullable=true)
	private String bairro;
	    
	@Column(name="emp_cidade", length=50, nullable=true)
	private String cidade;
	    
	@Column(name="emp_uf", length=50, nullable=true)
	private String uf;
	    
	@Column(name="emp_pais", length=50, nullable=true)
	private String pais;
	    
	@Column(name="emp_cep", length=50, nullable=true)
	private String cep;
	
	@OneToMany(mappedBy="empresa")
	private List<Convenio> convenio;
	
	@XmlTransient
	public List<Convenio> getConvenios() {
		return convenio;
	}
	

	public Empresa() {
		
	}

	public Empresa(long id, String razaoSocial, String nomeFantasia, String nomeResponsavel, String cnpj, String email,
			String telefone, String celular, String endereco, String bairro, String cidade, String uf, String pais,
			String cep) {
	
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.nomeResponsavel = nomeResponsavel;
		this.cnpj = cnpj;
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.pais = pais;
		this.cep = cep;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	

	public void setConvenio(List<Convenio> convenio) {
		this.convenio = convenio;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
