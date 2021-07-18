package com.example.frotasul.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.frotasul.entities.Carreta;
import com.example.frotasul.repositories.CarretaRepository;

@RestController
@RequestMapping(value = "/carretas")
public class CarretaResource {

	@Autowired
	private CarretaRepository repository;
	
	@GetMapping(value = "/{id}")
	
	public ResponseEntity<Carreta> findById(@PathVariable Long id) {
		Carreta obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}