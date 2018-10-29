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
@Table(name="modalidade")
public class Modalidade implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id //Indica chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Gera codigo automatico
	@Column(name="mod_id")
	private long id;
	
	@Column(name="mod_nomeModalidade", length=50, nullable=false)
	private String nomeModalidade;
	
	@Column(name="mod_descricao", columnDefinition="TEXT", nullable=true)
	private String descricao;

	@OneToMany(mappedBy="modalidade")
	private List<Treino> treino;
	
	@XmlTransient
    public List<Treino> getTreinos(){
    	return treino;
    }
	
	
	
	public Modalidade() {
	}

	public Modalidade(long id, String nomeModalidade, String descricao) {
		this.id = id;
		this.nomeModalidade = nomeModalidade;
		this.descricao = descricao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeModalidade() {
		return nomeModalidade;
	}

	public void setNomeModalidade(String nomeModalidade) {
		this.nomeModalidade = nomeModalidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		Modalidade other = (Modalidade) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
