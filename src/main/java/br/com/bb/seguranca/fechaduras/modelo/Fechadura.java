package br.com.bb.seguranca.fechaduras.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fechadura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String agencia;
	private Integer uor;
	private String marca;
	private Date ultimaAbertura;

	public Fechadura(Long id, String agencia, Integer uor, String marca, Date ultimaAbertura) {
		this.id = id;
		this.agencia = agencia;
		this.uor = uor;
		this.marca = marca;
		this.ultimaAbertura = ultimaAbertura;
	}

	public Fechadura() {

	}

	public Long getId() {
		return id;
	}

	public String getAgencia() {
		return agencia;
	}

	public Integer getUor() {
		return uor;
	}

	public String getMarca() {
		return marca;
	}

	public Date getUltimaAbertura() {
		return ultimaAbertura;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setUor(Integer uor) {
		this.uor = uor;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setUltimaAbertura(Date ultimaAbertura) {
		this.ultimaAbertura = ultimaAbertura;
	}

}
