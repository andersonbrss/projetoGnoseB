package com.projeto.gnose.service;

import java.util.List;

import com.projeto.gnose.model.Tipo;

public interface ITipoService {

	Tipo salvar( Tipo tipo );
	
	Tipo get( long idTipo );
	
	List<Tipo> getList();
	
	void update(long idTipo, Tipo tipo);

	void delete(long idTipo);
	
}
