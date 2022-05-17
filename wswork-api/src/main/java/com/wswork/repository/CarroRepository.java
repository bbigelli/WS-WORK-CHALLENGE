package com.wswork.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wswork.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer> {

}
