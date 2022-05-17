package com.challenge.wswork.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_carros")
public class Carro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String timestamp_cadastro;
	private Long modelo_id;
	private Integer ano;
	private String combustivel;
	private Integer num_portas;
	private String cor;
	
	public Carro() {}

	public Carro(Long id, String timestamp_cadastro, Long modelo_id, Integer ano, String combustivel, Integer num_portas,
			String cor) {
		super();
		this.id = id;
		this.timestamp_cadastro = timestamp_cadastro;
		this.modelo_id = modelo_id;
		this.ano = ano;
		this.combustivel = combustivel;
		this.num_portas = num_portas;
		this.cor = cor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTimestamp_cadastro() {
		return timestamp_cadastro;
	}

	public void setTimestamp_cadastro(String timestamp_cadastro) {
		this.timestamp_cadastro = timestamp_cadastro;
	}

	public Long getModelo_id() {
		return modelo_id;
	}

	public void setModelo_id(Long modelo_id) {
		this.modelo_id = modelo_id;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public Integer getNum_portas() {
		return num_portas;
	}

	public void setNum_portas(Integer num_portas) {
		this.num_portas = num_portas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
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
		Carro other = (Carro) obj;
		return Objects.equals(id, other.id);
	}
	
}
