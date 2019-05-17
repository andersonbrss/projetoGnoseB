package com.projeto.gnose.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity ( name = "tbl_cognicao")
public class Cognicao {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long idCognicao;
	@OneToOne( fetch = FetchType.EAGER )
	private Tipo tipo;
	@OneToOne( fetch = FetchType.EAGER )
	private Linguagem linguagem;
	@OneToOne( fetch = FetchType.EAGER )
	private Categoria categoria;
	@OneToOne( fetch = FetchType.EAGER )
	private Camada camada;
	
	@Column ( name = "nmCognicao" )
	private String nmCognicao;
	@Column ( name = "dsCognicao" )
	private String dsCognicao;
	@Column ( name = "nmVersao" )
	private String nmVersao;
	@Column ( name = "txCodigo" )
	private String txCodigo;
	@Column ( name = "txObservacao" , nullable = true)
	private String txObservacao;
	
	
	public Long getIdCognicao() {
		return idCognicao;
	}
	public void setIdCognicao(Long idCognicao) {
		this.idCognicao = idCognicao;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public Linguagem getLinguagem() {
		return linguagem;
	}
	public void setLinguagem(Linguagem linguagem) {
		this.linguagem = linguagem;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Camada getCamada() {
		return camada;
	}
	public void setCamada(Camada camada) {
		this.camada = camada;
	}
	public String getNmCognicao() {
		return nmCognicao;
	}
	public void setNmCognicao(String nmCognicao) {
		this.nmCognicao = nmCognicao;
	}
	public String getDsCognicao() {
		return dsCognicao;
	}
	public void setDsCognicao(String dsCognicao) {
		this.dsCognicao = dsCognicao;
	}
	public String getNmVersao() {
		return nmVersao;
	}
	public void setNmVersao(String nmVersao) {
		this.nmVersao = nmVersao;
	}
	public String getTxCodigo() {
		return txCodigo;
	}
	public void setTxCodigo(String txCodigo) {
		this.txCodigo = txCodigo;
	}
	public String getTxObservacao() {
		return txObservacao;
	}
	public void setTxObservacao(String txObservacao) {
		this.txObservacao = txObservacao;
	}
	
}
