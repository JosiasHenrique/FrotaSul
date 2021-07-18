package com.example.frotasul.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.frotasul.entities.Caminhao;
import com.example.frotasul.repositories.CaminhaoRepository;

@RestController
@RequestMapping(value = "/caminhoes")
public class ViagemResource {

	@Autowired
	private CaminhaoRepository repository;
	
	@GetMapping(value = "/{id}")
	
	public ResponseEntity<Caminhao> findById(@PathVariable Long id) {
		Caminhao obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}