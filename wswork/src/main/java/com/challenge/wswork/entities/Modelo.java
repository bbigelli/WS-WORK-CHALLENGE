package com.challenge.wswork.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_modelos")
public class Modelo implements Serializable {	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long marca_id;
	private String nome;
	private Double valor_fipe;	

	public Modelo(Long id, Long marca_id, String nome, Double valor_fipe) {
		this.id = id;
		this.marca_id = marca_id;
		this.nome = nome;
		this.valor_fipe = valor_fipe;
	}

	public Long getId() {
		return id;
	}	

	public Long getMarca_id() {
		return marca_id;
	}

	public void setMarca_id(Long marca_id) {
		this.marca_id = marca_id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return Objects.hash(id);
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
		return Objects.equals(id, other.id);
	}
	
}
