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

import com.projeto.gnose.model.Categoria;
import com.projeto.gnose.service.ICategoriaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private ICategoriaService categoriaService;
	
	@PostMapping
	private ResponseEntity<String> salvar( @RequestBody Categoria categoria ) {
		categoria = categoriaService.salvar( categoria );
		return ResponseEntity.ok().body( "Nova categoria cadastrada " + categoria.getDsCategoria());
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<Categoria> get( @PathVariable("id") long idCategoria ) {
		Categoria categoria = categoriaService.get( idCategoria );
		return ResponseEntity.ok().body( categoria );
	}
	
	@GetMapping
	private ResponseEntity< List<Categoria> > getList() {
		List<Categoria> categoriaList = categoriaService.getList();
		return ResponseEntity.ok().body( categoriaList );
	}
	
	@PutMapping("/{id}")
	private ResponseEntity<String> update( @PathVariable("id") long idCategoria, @RequestBody Categoria categoria ) {
		categoriaService.update( idCategoria, categoria );
		return ResponseEntity.ok().body( "A categoria foi atualizada com sucesso" );
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<String> delete( @PathVariable("id") long idCategoria ) {
		categoriaService.delete( idCategoria );
		return ResponseEntity.ok().body( "A categoria foi excluida com sucesso " );
	}
	
}
