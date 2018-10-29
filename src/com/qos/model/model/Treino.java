package com.qos.model.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="treino")
public class Treino implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id //Indica chave primária
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Gera codigo automatico
	@Column(name="tre_id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="alu_id", referencedColumnName="alu_id")
	Aluno aluno;
		
	@ManyToOne
	@JoinColumn(name="mod_id", referencedColumnName="mod_id")
	Modalidade modalidade;
	
	@Column(name="tre_descricao", columnDefinition="TEXT", nullable=true)
	private String descricao;
	
	@Column(name="tre_dataTreino", length=50, nullable=true)
    private String dataTreino;
	
	

	public Treino() {
	}

	

	public Treino(long id, Aluno aluno, Modalidade modalidade, String descricao, String dataTreino) {
		this.id = id;
		this.aluno = aluno;
		this.modalidade = modalidade;
		this.descricao = descricao;
		this.dataTreino = dataTreino;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public Aluno getAluno() {
		return aluno;
	}



	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}



	public Modalidade getModalidade() {
		return modalidade;
	}



	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public String getDataTreino() {
		return dataTreino;
	}



	public void setDataTreino(String dataTreino) {
		this.dataTreino = dataTreino;
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
		Treino other = (Treino) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	

}
