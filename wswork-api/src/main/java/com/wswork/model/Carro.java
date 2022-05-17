package com.wswork.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_carros")
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Date timestamp_cadastro;
		
	@Column(nullable = false)
	private Long modelo_id;
	
	@Column(nullable = false)
	private String ano;
	
	@Column(nullable = false)
	private String combustivel;
	
	@Column(nullable = false)
	private Integer num_portas;
	
	@Column(nullable = false)
	private String cor;	
	
	public Carro() {		
	}

	public Carro(Long id, Date timestamp_cadastro, Long modelo_id, String ano, String combustivel,
			Integer num_portas, String cor) {
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

	public Date getTimestamp_cadastro() {
		return timestamp_cadastro;
	}

	public void setTimestamp_cadastro(Date timestamp_cadastro) {
		this.timestamp_cadastro = timestamp_cadastro;
	}

	public Long getModelo_id() {
		return modelo_id;
	}

	public void setModelo_id(Long modelo_id) {
		this.modelo_id = modelo_id;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
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
		return Objects.hash(id, modelo_id);
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
		return Objects.equals(id, other.id) && Objects.equals(modelo_id, other.modelo_id);
	}
	
	
}