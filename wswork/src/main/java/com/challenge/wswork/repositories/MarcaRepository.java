package com.challenge.wswork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.wswork.entities.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {

	
}
