package com.wswork.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_modelos")
public class Modelo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;	
	
	@Column(nullable = false)	
	private Integer marca_id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Double valor_fipe;	
	
	public Modelo() {		
	}

	public Modelo(Integer id, Integer marca_id, String nome, Double valor_fipe) {
		this.id = id;
		this.marca_id = marca_id;
		this.nome = nome;
		this.valor_fipe = valor_fipe;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMarca_id() {
		return marca_id;
	}

	public void setMarca_id(Integer marca_id) {
		this.marca_id = marca_id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor_fipe() {
		return valor_fipe;
	}

	public void setValor_fipe(Double valor_fipe) {
		this.valor_fipe = valor_fipe;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, marca_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modelo other = (Modelo) obj;
		return Objects.equals(id, other.id) && Objects.equals(marca_id, other.marca_id);
	}
	
}