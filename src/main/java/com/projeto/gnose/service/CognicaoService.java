package com.projeto.gnose.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.gnose.dao.ICognicaoDao;
import com.projeto.gnose.model.Cognicao;

@Service
@Transactional ( readOnly = true )
public class CognicaoService implements ICognicaoService {

	@Autowired
	private ICognicaoDao cognicaoDao;
	
	@Transactional
	@Override
	public Cognicao salvar(Cognicao cognicao) {
		return cognicaoDao.salvar( cognicao );
	}

	@Override
	public Cognicao get(long idCognicao) {
		return cognicaoDao.get( idCognicao );
	}

	@Override
	public List<Cognicao> getList() {
		return cognicaoDao.getList();
	}

	@Transactional
	@Override
	public void update(long idCognicao, Cognicao cognicao) {
		cognicaoDao.update( idCognicao, cognicao );
	}

	@Transactional
	@Override
	public void delete(long idCognicao) {
		cognicaoDao.delete( idCognicao );
	}

}
