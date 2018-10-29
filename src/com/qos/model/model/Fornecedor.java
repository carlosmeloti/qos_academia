package com.qos.model.model;

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
@Table(name="fornecedor")
public class Fornecedor {

	@Id //Indica chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Gera codigo automatico
	@Column(name="for_id")
	private long id;
	
	@Column(name="for_razaoSocial", length=50, nullable=false)
	private String razaoSocial;
	
	@Column(name="for_nomeFantasia", length=50, nullable=false)
	private String nomeFantasia;
	
	@Column(name="for_nomeResponsavel", length=50, nullable=true)
	private String nomeResponsavel;
	
	@Column(name="for_cnpj", length=50, nullable=true)
	private String cnpj;
	
	@Column(name="for_email", length=50, nullable=true)
	private String email;
	
	@Column(name="for_telefone", length=50, nullable=true)
    private String telefone;
	
	@Column(name="for_celular", length=50, nullable=true)
    private String celular;
	
	@Column(name="for_endereco", length=50, nullable=true)
	private String endereco;
	    
	@Column(name="for_bairro", length=50, nullable=true)
	private String bairro;
	    
	@Column(name="for_cidade", length=50, nullable=true)
	private String cidade;
	    
	@Column(name="for_uf", length=50, nullable=true)
	private String uf;
	    
	@Column(name="for_pais", length=50, nullable=true)
	private String pais;
	    
	@Column(name="for_cep", length=50, nullable=true)
	private String cep;
	
	@OneToMany(mappedBy="fornecedor")
	private List<ContasAPagar> contasAPagar;
	
	@XmlTransient
	public List<ContasAPagar> getContasAPagar() {
		return contasAPagar;
	}
	
	

	public Fornecedor() {
	}



	public Fornecedor(long id, String razaoSocial, String nomeFantasia, String nomeResponsavel, String cnpj,
			String email, String telefone, String celular, String endereco, String bairro, String cidade, String uf,
			String pais, String cep, List<ContasAPagar> contasAPagar) {
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
		this.contasAPagar = contasAPagar;
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



	public void setContasAPagar(List<ContasAPagar> contasAPagar) {
		this.contasAPagar = contasAPagar;
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
		Fornecedor other = (Fornecedor) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
