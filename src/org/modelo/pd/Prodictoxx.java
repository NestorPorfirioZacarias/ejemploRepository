package org.modelo.pd;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Prodictoxx {
	private int id;
	private String Nombre;
	private double precio;
	private Detallepro detallepro_id_fk;
	@Id
	@Column(nullable=false)
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="detallepro_id_fk")
	
	public Detallepro getDetallepro_id_fk() {
		return detallepro_id_fk;
	}
	public void setDetallepro_id_fk(Detallepro detallepro_id_fk) {
		this.detallepro_id_fk = detallepro_id_fk;
	}
}
