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

import com.projeto.gnose.model.Linguagem;
import com.projeto.gnose.service.ILinguagemService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/linguagem")
public class LinguagemController {

	@Autowired
	private ILinguagemService linguagemService;
	
	@PostMapping
	public ResponseEntity<?> salvar( @RequestBody Linguagem linguagem ) {
		linguagem = linguagemService.salvar( linguagem );
		return ResponseEntity.ok().body("Nova linguagem adicionada " + linguagem.getNmLinguagem() );
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Linguagem> get( @PathVariable("id") long id ) {
		Linguagem linguagem = linguagemService.get( id );
		return ResponseEntity.ok().body( linguagem );
	}
	
	@GetMapping
	public ResponseEntity<List<Linguagem>> list() {
		List<Linguagem> linguagemList = linguagemService.getList();
		return ResponseEntity.ok().body( linguagemList );
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> update( @PathVariable("id") long id, @RequestBody Linguagem linguagem ) {
		linguagemService.update( id, linguagem);
		return ResponseEntity.ok().body( "registro atualizado com sucesso." );
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete( @PathVariable("id") long id ) {
		linguagemService.delete( id );
		return ResponseEntity.ok().body( "registro excluido com sucesso." );
	}
	
}
