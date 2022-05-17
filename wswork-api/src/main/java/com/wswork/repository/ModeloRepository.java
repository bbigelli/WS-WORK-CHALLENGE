package com.wswork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wswork.model.Modelo;

@Repository
public interface ModeloRepository extends JpaRepository<Modelo, Integer> {

}
