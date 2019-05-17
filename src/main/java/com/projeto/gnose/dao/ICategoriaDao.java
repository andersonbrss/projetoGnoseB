package com.projeto.gnose.dao;

import java.util.List;

import com.projeto.gnose.model.Categoria;

public interface ICategoriaDao {

	Categoria salvar( Categoria categoria);
	
	Categoria get( long idCategoria );
	
	List<Categoria> getList();
	
	void update( long idCategoria, Categoria categoria );
	
	void delete( long idCategoria );
	
}
