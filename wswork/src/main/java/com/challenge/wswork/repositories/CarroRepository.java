package com.challenge.wswork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.wswork.entities.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

	
}
