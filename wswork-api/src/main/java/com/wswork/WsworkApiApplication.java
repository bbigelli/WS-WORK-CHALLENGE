package com.wswork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wswork.model.Marca;
import com.wswork.repository.MarcaRepository;

@SpringBootApplication
public class WsworkApiApplication implements CommandLineRunner{

	@Autowired
	private MarcaRepository marcaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(WsworkApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Marca marca1 = new Marca(1L, "TOYOTA");
		Marca marca2 = new Marca(2L, "FORD");
		Marca marca3 = new Marca(3L, "FIAT");
		Marca marca4 = new Marca(4L, "VW");	
		
		marcaRepository.save(marca1);
		marcaRepository.save(marca2);
		marcaRepository.save(marca3);
		marcaRepository.save(marca4);
	}
}