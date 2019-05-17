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

import com.projeto.gnose.model.Tipo;
import com.projeto.gnose.service.ITipoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/tipo")
public class TipoController {

	@Autowired
	private ITipoService tipoService;
	
	/*---Add tipo---*/
    @PostMapping
    public ResponseEntity<?> salvar( @RequestBody Tipo tipo ) {
       tipo = tipoService.salvar( tipo );
       return ResponseEntity.ok().body("Novo tipo adicionado" + tipo.getIdTipo() );
    }

    /*---pega tipo por id---*/
    @GetMapping("/{id}")
    public ResponseEntity<Tipo> get(@PathVariable("id") long id) {
       Tipo tipo = tipoService.get( id );
       return ResponseEntity.ok().body( tipo );
    }

    /*--- pega lista de tipos ---*/
    @GetMapping
    public ResponseEntity<List<Tipo>> list() {
       List<Tipo> tipoList = tipoService.getList();
       return ResponseEntity.ok().body( tipoList );
    }

    /*--- atualiza tipo por id ---*/
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Tipo tipo) {
	    tipoService.update( id, tipo );
       return ResponseEntity.ok().body("tipo atualizado com sucesso.");
    }

    /*---deleta tipo por id ---*/
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
	    tipoService.delete( id );
       return ResponseEntity.ok().body("Tipo excluido com sucesso.");
    }
}
