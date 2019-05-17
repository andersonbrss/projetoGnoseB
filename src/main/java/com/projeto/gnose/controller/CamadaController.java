package com.projeto.gnose.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.gnose.model.Camada;
import com.projeto.gnose.service.ICamadaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/camada")
public class CamadaController {

	@Autowired
	private ICamadaService camadaService;
	
	@PostMapping
	private ResponseEntity<String> salvar( @RequestBody Camada camada) {
		camada = camadaService.salvar( camada );
		return ResponseEntity.ok().body( "Nova camada adicionada " + camada.getDsCamada() );
	}

	@GetMapping("/{id}")
	private ResponseEntity<Camada> get( @PathVariable("id") long idCamada ) {
		Camada camada = camadaService.getCamada( idCamada );
		return ResponseEntity.ok().body( camada );
	}

	@GetMapping
	private ResponseEntity<List<Camada>> getList() {
		List<Camada> camadaList = camadaService.getCamadaList();
		return ResponseEntity.ok().body( camadaList );
	}

	@PutMapping
	private ResponseEntity<String> update( @RequestBody Camada camada ) {
		camadaService.update( camada );
		return ResponseEntity.ok().body( "Camada alterada com sucesso." );
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<String> delete( @PathVariable("id") long idCamada ) {
		camadaService.delete( idCamada );
		return ResponseEntity.ok().body( "Camada excluida com sucesso." );
	}
	
}
