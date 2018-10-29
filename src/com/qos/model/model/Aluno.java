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
@Table(name="aluno")
public class Aluno implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id //Indica chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Gera codigo automatico
	@Column(name="alu_id")
	private long id;
	
	@Column(name="alu_nome", length=50, nullable=false)
    private String nome;
	
	@Column(name="alu_nomeResponsavel", length=50, nullable=true)
    private String nomeResponsavel;
	
	@Column(name="alu_sexo", length=50, nullable=true)
    private String sexo;
	
	@Column(name="alu_rg", length=50, nullable=true)
    private String rg;
	
	@Column(name="alu_cpf", length=50, nullable=true)
    private String cpf;
	
	@Column(name="alu_dataNascimento", length=50, nullable=false)
    private String dataNascimento;
	
	@Column(name="alu_estadoCivil", length=50, nullable=true)
    private String estadoCivil;
	
	@Column(name="alu_email", length=50, nullable=true)
    private String email;
	
	@Column(name="alu_telefone", length=50, nullable=true)
    private String telefone;
	
	@Column(name="alu_celular", length=50, nullable=true)
    private String celular;
	
	@Column(name="alu_nacionalidade", length=50, nullable=true)
    private String nacionalidade;
	
	@Column(name="alu_naturalidade", length=50, nullable=true)
    private String naturalidade;
	
	@Column(name="alu_profissao", length=50, nullable=true)
    private String profissao;
	
	@Column(name="alu_endereco", length=50, nullable=true)
    private String endereco;
    
    @Column(name="alu_bairro", length=50, nullable=true)
    private String bairro;
    
    @Column(name="alu_cidade", length=50, nullable=true)
    private String cidade;
    
    @Column(name="alu_uf", length=50, nullable=true)
    private String uf;
    
    @Column(name="alu_pais", length=50, nullable=true)
    private String pais;
    
    @Column(name="alu_cep", length=50, nullable=true)
    private String cep;
    
    @OneToMany(mappedBy="aluno")
    private List<Treino> treino;
    
    @XmlTransient
    public List<Treino> getTreinos(){
    	return treino;
    }
		


	public Aluno() {
	}

	public Aluno(long id, String nome, String nomeResponsavel, String sexo, String rg, String cpf, String dataNascimento,
			String estadoCivil, String email, String telefone, String celular, String nacionalidade,
			String naturalidade, String profissao, String endereco, String bairro, String cidade, String uf,
			String pais, String cep) {
		this.id = id;
		this.nome = nome;
		this.nomeResponsavel = nomeResponsavel;
		this.sexo = sexo;
		this.rg = rg;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.estadoCivil = estadoCivil;
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
		this.nacionalidade = nacionalidade;
		this.naturalidade = naturalidade;
		this.profissao = profissao;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
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

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
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
	
	


	public void setTreino(List<Treino> treino) {
		this.treino = treino;
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
		Aluno other = (Aluno) obj;
		if (id != other.id)
			return false;
		return true;
	}
    
    

	
    

}
