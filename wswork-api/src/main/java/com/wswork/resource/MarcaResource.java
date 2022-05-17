package com.wswork.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wswork.model.Marca;
import com.wswork.repository.MarcaRepository;

@RestController
@RequestMapping(value = "/marcas")
public class MarcaResource {
	
	@Autowired
	public MarcaRepository marcaRepository;
	
	@GetMapping
	public ResponseEntity<List<Marca>> findAll() {
		List<Marca> list = 	marcaRepository.FindAll();
		return ResponseEntity.ok().body(list);	
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Marca> findById(@PathVariable Long id) {
		Marca marca = marcaRepository.findById(id);
		return ResponseEntity.ok().body(marca);
	}
}