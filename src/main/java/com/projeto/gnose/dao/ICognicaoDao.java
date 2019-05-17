package com.projeto.gnose.dao;

import java.util.List;

import com.projeto.gnose.model.Cognicao;

public interface ICognicaoDao {

	Cognicao salvar( Cognicao cognicao );
	
	Cognicao get( Long idCognicao );
	
	List<Cognicao> getList();
	
	void update( long idCognicao, Cognicao cognicao );
	
	void delete( long idCognicao );
}
