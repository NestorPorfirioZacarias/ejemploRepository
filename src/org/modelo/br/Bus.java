package org.modelo.br;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Bus {
	private int id;
	private int numero;
	private String placa;
	private String modelo;
	private String descripcion;
	private Ruta ruta_id_fk;
	@Id
	@Column(nullable=false)
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@ManyToOne
	@JoinColumn(name="ruta_id_fk")
	
	public Ruta getRuta_id_fk() {
		return ruta_id_fk;
	}
	public void setRuta_id_fk(Ruta ruta_id_fk) {
		this.ruta_id_fk = ruta_id_fk;
	}

}
