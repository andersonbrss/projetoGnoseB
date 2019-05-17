package com.projeto.gnose.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public interface IController {

	@PostMapping
	ResponseEntity<String> salvar(  );
	
	ResponseEntity<Object> get(  );
	
	ResponseEntity< List<Object> > getList();
	
	
	
}
