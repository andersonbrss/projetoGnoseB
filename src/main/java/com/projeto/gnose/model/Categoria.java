package com.projeto.gnose.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name = "tbl_categoria")
public class Categoria {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long idCategoria;
	@Column(name = "dsCategoria")
	private String dsCategoria;
	
	public Long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public String getDsCategoria() {
		return dsCategoria;
	}
	public void setDsCategoria(String dsCategoria) {
		this.dsCategoria = dsCategoria;
	}
	
}
