package com.challenge.wswork.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.challenge.wswork.entities.Modelo;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Long> {

	
}
