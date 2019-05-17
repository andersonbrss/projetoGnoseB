package com.projeto.gnose.dao;

import java.util.List;

import com.projeto.gnose.model.Camada;

public interface ICamadaDao {

	Camada salvar( Camada camada );
	
	Camada getCamada( long idCamada );
	
	List<Camada> getCamadaList();
	
	void update( Camada camada );
	
	void delete( long idCamada );
}
