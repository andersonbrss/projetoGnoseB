package com.projeto.gnose.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.gnose.dao.ILinguagemDao;
import com.projeto.gnose.model.Linguagem;

@Service
@Transactional(readOnly = true)
public class LinguagemService implements ILinguagemService {

	@Autowired
	private ILinguagemDao linguagemDao;
	
	@Transactional
	@Override
	public Linguagem salvar(Linguagem linguagem) {
		return linguagemDao.salvar( linguagem );
	}

	@Override
	public Linguagem get(long idLinguagem) {
		return linguagemDao.get( idLinguagem );
	}

	@Override
	public List<Linguagem> getList() {
		return linguagemDao.getList();
	}

	@Transactional
	@Override
	public void update(long idLinguagem, Linguagem linguagem) {
		linguagemDao.update( idLinguagem, linguagem );
	}

	@Transactional
	@Override
	public void delete(long idLinguagem) {
		linguagemDao.delete( idLinguagem );
	}

}
