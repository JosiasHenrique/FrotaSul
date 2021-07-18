package com.example.frotasul.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.frotasul.entities.Abastecimento;
import com.example.frotasul.repositories.AbastecimentoRepository;

@RestController
@RequestMapping(value = "/abastecimentos")
public class AbastecimentoResource {

	@Autowired
	private AbastecimentoRepository repository;
	
	@GetMapping(value = "/{id}")
	
	public ResponseEntity<Abastecimento> findById(@PathVariable Long id) {
		Abastecimento obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}