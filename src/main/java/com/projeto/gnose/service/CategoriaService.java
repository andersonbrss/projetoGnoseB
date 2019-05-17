package com.projeto.gnose.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.gnose.dao.ICategoriaDao;
import com.projeto.gnose.model.Categoria;

@Service
@Transactional( readOnly = true )
public class CategoriaService implements ICategoriaService{

	@Autowired
	private ICategoriaDao categoriaDao;
	
	@Transactional
	@Override
	public Categoria salvar(Categoria categoria) {
		return categoriaDao.salvar( categoria );
	}

	@Override
	public Categoria get(long idCategoria) {
		return categoriaDao.get( idCategoria );
	}

	@Override
	public List<Categoria> getList() {
		return categoriaDao.getList();
	}

	@Transactional
	@Override
	public void update(long idCategoria, Categoria categoria) {
		categoriaDao.update( idCategoria, categoria );
	}

	@Transactional
	@Override
	public void delete(long idCategoria) {
		categoriaDao.delete( idCategoria );
	}
	
}
