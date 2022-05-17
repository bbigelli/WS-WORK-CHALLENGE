package com.challenge.wswork.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.wswork.entities.Marca;
import com.challenge.wswork.repositories.MarcaRepository;

@RestController
@RequestMapping(value = "/marcas")
public class MarcaResource {
	
	@Autowired
	private MarcaRepository marcaRepository;
	
	@GetMapping
	public ResponseEntity<List<Marca>> findAll() {
		List<Marca> list = marcaRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Marca> findById(@PathVariable Long id) {
		Marca marca = marcaRepository.findById(id).get();
		return ResponseEntity.ok().body(marca);
	}

}
