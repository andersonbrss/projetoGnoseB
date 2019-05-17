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

import com.projeto.gnose.model.Cognicao;
import com.projeto.gnose.service.ICognicaoService;

@CrossOrigin ( origins="*" )
@RestController
@RequestMapping("/cognicao")
public class CognicaoController {

	@Autowired
	private ICognicaoService cognicaoService;
	
	@PostMapping
	public ResponseEntity<?> salvar( @RequestBody Cognicao cognicao) {
		cognicao = cognicaoService.salvar( cognicao );
		return ResponseEntity.ok().body("Nova cognição adicionada " + cognicao.getNmCognicao() );
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<Cognicao> get( @PathVariable("id") long id ) {
		Cognicao cognicao = cognicaoService.get( id );
		return ResponseEntity.ok().body( cognicao );
	}
	
	@GetMapping
	private ResponseEntity<List<Cognicao>> getList() {
		List<Cognicao> cognicaoList = cognicaoService.getList();
		return ResponseEntity.ok().body( cognicaoList );
	}
	
	@PutMapping("/{id}")
	private ResponseEntity<String> update( @PathVariable("id") long id, @RequestBody Cognicao cognicao ) {
		cognicaoService.update( id, cognicao );
		return ResponseEntity.ok().body( "Registro alterado com sucesso." );
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<String> delete( @PathVariable("id") long id) {
		cognicaoService.delete( id );
		return ResponseEntity.ok().body( "Registro excluido com sucesso." );
	}
	
}
