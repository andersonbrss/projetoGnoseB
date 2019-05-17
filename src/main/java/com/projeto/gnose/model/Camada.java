package com.projeto.gnose.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name= "tbl_camada")
public class Camada {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Long idCamada;
	@Column(name= "dsCamada")
	private String dsCamada;
	
	public Long getIdCamada() {
		return idCamada;
	}
	public void setIdCamada(Long idCamada) {
		this.idCamada = idCamada;
	}
	public String getDsCamada() {
		return dsCamada;
	}
	public void setDsCamada(String dsCamada) {
		this.dsCamada = dsCamada;
	}
}
