package com.projeto.gnose.service;

import java.util.List;

import com.projeto.gnose.model.Camada;

public interface ICamadaService {

	Camada salvar( Camada camada );
	
	Camada getCamada( long idCamada );
	
	List<Camada> getCamadaList();
	
	void update( Camada camada );
	
	void delete( long idCamada );
}
