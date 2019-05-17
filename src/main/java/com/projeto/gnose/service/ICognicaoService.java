package com.projeto.gnose.service;

import java.util.List;

import com.projeto.gnose.model.Cognicao;

public interface ICognicaoService {

	Cognicao salvar( Cognicao cognicao );
	
	Cognicao get( long idCognicao );
	
	List<Cognicao> getList();
	
	void update( long idCognicao, Cognicao cognicao );
	
	void delete( long idCognicao );
}
