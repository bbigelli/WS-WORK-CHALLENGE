package com.challenge.wswork.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.wswork.entities.Carro;
import com.challenge.wswork.repositories.CarroRepository;

@RestController
@RequestMapping(value = "/carros")
public class CarroResource {
	
	@Autowired
	private CarroRepository carroRepository;
	
	@GetMapping
	public ResponseEntity<List<Carro>> findAll() {
		List<Carro> list = carroRepository.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Carro> findById(@PathVariable Long id) {
		Carro carro = carroRepository.findById(id).get();
		return ResponseEntity.ok().body(carro);
	}

}
