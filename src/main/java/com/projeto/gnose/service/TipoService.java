package com.projeto.gnose.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.gnose.dao.ITipoDao;
import com.projeto.gnose.model.Tipo;

@Service
@Transactional(readOnly = true)
public class TipoService implements ITipoService {

	@Autowired
	private ITipoDao tipoDao;
	
	@Transactional
	@Override
	public Tipo salvar(Tipo tipo) {
		return tipoDao.salvar( tipo );
	}

	@Override
	public Tipo get(long idTipo) {
		return tipoDao.get( idTipo );
	}

	@Override
	public List<Tipo> getList() {
		return tipoDao.getList();
	}

	@Transactional
	@Override
	public void update(long idTipo, Tipo tipo) {
		tipoDao.update( idTipo, tipo );
	}

	@Transactional
	@Override
	public void delete(long idTipo) {
		tipoDao.delete( idTipo );
	}

}
