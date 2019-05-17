package com.projeto.gnose.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projeto.gnose.model.Tipo;

@Repository
public class TipoDao implements ITipoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Tipo salvar(Tipo tipo) {
		sessionFactory.getCurrentSession().save(tipo);
		return tipo;
	}

	@Override
	public Tipo get(long idTipo) {
		return sessionFactory.getCurrentSession().get(Tipo.class, idTipo);
	}

	@Override
	public List<Tipo> getList() {
		 List<Tipo> list = sessionFactory.getCurrentSession().createQuery("from tbl_tipo").list();
	     return list;
	}

	@Override
	public void update(long idTipo, Tipo tipo) {
		Session session = sessionFactory.getCurrentSession();
		Tipo tipo2 = session.byId(Tipo.class).load( idTipo );
		tipo2.setDsTipo( tipo.getDsTipo() );
	    session.flush();
	}

	@Override
	public void delete(long idTipo) {
		Tipo tipo = sessionFactory.getCurrentSession().byId( Tipo.class).load( idTipo );
	    sessionFactory.getCurrentSession().delete( tipo );
	}

}
