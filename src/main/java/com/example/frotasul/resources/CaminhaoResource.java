package com.example.frotasul.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.frotasul.entities.Viagem;
import com.example.frotasul.repositories.ViagemRepository;

@RestController
@RequestMapping(value = "/viagens")
public class CaminhaoResource {

	@Autowired
	private ViagemRepository repository;
	
	@GetMapping(value = "/{id}")
	
	public ResponseEntity<Viagem> findById(@PathVariable Long id) {
		Viagem obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}