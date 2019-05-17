package com.projeto.gnose.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projeto.gnose.model.Categoria;

@Repository
public class CategoriaDao implements ICategoriaDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Categoria salvar(Categoria categoria) {
		sessionFactory.getCurrentSession().save( categoria );
		return categoria;
	}

	@Override
	public Categoria get(long idCategoria) {
		return sessionFactory.getCurrentSession().get( Categoria.class, idCategoria );
	}

	@Override
	public List<Categoria> getList() {
		List<Categoria> categoriaList = sessionFactory.getCurrentSession().createQuery("from tbl_categoria").list();
		return categoriaList;
	}

	@Override
	public void update(long idCategoria, Categoria categoria) {
		sessionFactory.getCurrentSession().update( categoria );
	}

	@Override
	public void delete(long idCategoria) {
		Categoria categoria = sessionFactory.getCurrentSession().get( Categoria.class, idCategoria );
		sessionFactory.getCurrentSession().delete( categoria );
	}

}
