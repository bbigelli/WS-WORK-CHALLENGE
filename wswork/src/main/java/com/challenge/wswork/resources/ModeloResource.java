package com.challenge.wswork.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.wswork.entities.Modelo;
import com.challenge.wswork.repositories.ModeloRepository;

@RestController
@RequestMapping(value = "/modelos")
public class ModeloResource {
	
	@Autowired
	private ModeloRepository modeloRepository;
	
	@GetMapping
	public ResponseEntity<List<Modelo>> findAll() {
		List<Modelo> list = modeloRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Modelo> findById(@PathVariable Long id) {
		Modelo modelo = modeloRepository.findById(id).get();
		return ResponseEntity.ok().body(modelo);
	}

}
