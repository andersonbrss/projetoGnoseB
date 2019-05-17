package com.projeto.gnose.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto.gnose.dao.ICamadaDao;
import com.projeto.gnose.model.Camada;

@Service
@Transactional( readOnly = true )
public class CamadaService implements ICamadaService {

	@Autowired
	private ICamadaDao camadaDao;
	
	@Transactional
	@Override
	public Camada salvar(Camada camada) {
		return camadaDao.salvar( camada );
	}

	@Override
	public Camada getCamada( long idCamada ) {
		return camadaDao.getCamada( idCamada );
	}

	@Override
	public List<Camada> getCamadaList() {
		return camadaDao.getCamadaList();
	}

	@Transactional
	@Override
	public void update(Camada camada) {
		camadaDao.update( camada );
	}

	@Transactional
	@Override
	public void delete(long idCamada) {
		camadaDao.delete( idCamada );
	}

}
