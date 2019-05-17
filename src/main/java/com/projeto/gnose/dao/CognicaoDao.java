package com.projeto.gnose.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projeto.gnose.model.Cognicao;

@Repository
public class CognicaoDao implements ICognicaoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Cognicao salvar(Cognicao cognicao) {
		sessionFactory.getCurrentSession().save( cognicao );
		return cognicao;
	}

	@Override
	public Cognicao get(Long idCognicao) {
		return sessionFactory.getCurrentSession().get( Cognicao.class, idCognicao );
	}

	@Override
	public List<Cognicao> getList() {
		return sessionFactory.getCurrentSession().createQuery("from tbl_cognicao").list();
	}

	@Override
	public void update(long idCognicao, Cognicao cognicao) {
		sessionFactory.getCurrentSession().update( cognicao );
	}

	@Override
	public void delete(long idCognicao) {
		Cognicao cognicao = sessionFactory.getCurrentSession().byId( Cognicao.class ).load( idCognicao );
		sessionFactory.getCurrentSession().delete( cognicao );
	}

}
