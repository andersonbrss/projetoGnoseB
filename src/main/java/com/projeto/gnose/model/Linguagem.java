package com.projeto.gnose.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity( name = "tbl_linguagem")
public class Linguagem {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long idLinguagem;
	@Column( name = "nmLinguagem")
	private String nmLinguagem;
	
	public Long getIdLinguagem() {
		return idLinguagem;
	}
	public void setIdLinguagem(Long idLinguagem) {
		this.idLinguagem = idLinguagem;
	}
	public String getNmLinguagem() {
		return nmLinguagem;
	}
	public void setNmLinguagem(String nmLinguagem) {
		this.nmLinguagem = nmLinguagem;
	}
}
