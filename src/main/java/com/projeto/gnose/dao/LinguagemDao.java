package com.projeto.gnose.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projeto.gnose.model.Linguagem;

@Repository
public class LinguagemDao implements ILinguagemDao {

	@Autowired
	private SessionFactory sessaoFactory;
	
	@Override
	public Linguagem salvar(Linguagem linguagem) {
		sessaoFactory.getCurrentSession().save( linguagem );
		return linguagem;
	}

	@Override
	public Linguagem get(long idLinguagem) {
		return sessaoFactory.getCurrentSession().get( Linguagem.class, idLinguagem );
	}

	@Override
	public List<Linguagem> getList() {
		return sessaoFactory.getCurrentSession().createQuery("from tbl_linguagem").list();
	}

	@Override
	public void update(long idLinguagem, Linguagem linguagem) {
		Session sessao = sessaoFactory.getCurrentSession();
		Linguagem linguagem2 = sessao.byId( Linguagem.class ).load( idLinguagem );
		linguagem2.setNmLinguagem( linguagem.getNmLinguagem() );
		sessao.flush();
	}

	@Override
	public void delete(long idLinguagem) {
		Linguagem linguagem = sessaoFactory.getCurrentSession().byId( Linguagem.class ).load( idLinguagem );
		sessaoFactory.getCurrentSession().delete( linguagem );
	}

}
