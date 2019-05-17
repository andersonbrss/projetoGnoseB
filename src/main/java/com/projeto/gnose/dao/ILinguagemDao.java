package com.projeto.gnose.dao;

import java.util.List;

import com.projeto.gnose.model.Linguagem;

public interface ILinguagemDao {

	Linguagem salvar( Linguagem linguagem );
	
	Linguagem get( long idLinguagem );
	
	List<Linguagem> getList();
	
	void update ( long idLinguagem, Linguagem linguagem );
	
	void delete ( long idLinguagem );
}
