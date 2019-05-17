package com.projeto.gnose.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projeto.gnose.model.Camada;

@Repository
public class CamadaDao implements ICamadaDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Camada salvar(Camada camada) {
		sessionFactory.getCurrentSession().save( camada );
		return camada;
	}

	@Override
	public Camada getCamada(long idCamada) {
		return sessionFactory.getCurrentSession().get( Camada.class, idCamada );
	}

	@Override
	public List<Camada> getCamadaList() {
		List<Camada> camadaList = sessionFactory.getCurrentSession().createQuery("from tbl_camada").list();
		return camadaList;
	}

	@Override
	public void update(Camada camada) {
		sessionFactory.getCurrentSession().update( camada );
	}

	@Override
	public void delete(long idCamada) {
		Camada camada = sessionFactory.getCurrentSession().get( Camada.class, idCamada );
		sessionFactory.getCurrentSession().delete( camada );
	}

}
