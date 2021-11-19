package org.modelo_ps;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Productoy {
	private int idpy;
	private String nombre;
	private String descripcion;
	private String marca;
	private List<Sucursaly> sucursalies =  new ArrayList<Sucursaly>();
	@Id
	@Column
	@GeneratedValue
	public int getIdpy() {
		return idpy;
	}
	public void setIdpy(int idpy) {
		this.idpy = idpy;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@ManyToMany
	@JoinTable(name="proysucy",
				joinColumns= {@JoinColumn(name="idpy")},
				inverseJoinColumns= {@JoinColumn(name="idsy")})
	
	public List<Sucursaly> getSucursalies() {
		return sucursalies;
	}
	public void setSucursalies(List<Sucursaly> sucursalies) {
		this.sucursalies = sucursalies;
	}

}
