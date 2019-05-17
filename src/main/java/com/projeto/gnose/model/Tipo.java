package com.projeto.gnose.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbl_tipo")
public class Tipo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipo;
	@Column(name = "dsTipo")
	private String dsTipo;
	
	public Long getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}
	public String getDsTipo() {
		return dsTipo;
	}
	public void setDsTipo(String dsTipo) {
		this.dsTipo = dsTipo;
	}
	
}
