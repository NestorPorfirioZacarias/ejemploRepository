package org.modelo.br;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Ruta {
	private int id;
	private String nombre;
	private String trayectoria;
	private String parada;
	private List<Bus> bus;
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
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTrayectoria() {
		return trayectoria;
	}
	public void setTrayectoria(String trayectoria) {
		this.trayectoria = trayectoria;
	}
	public String getParada() {
		return parada;
	}
	public void setParada(String parada) {
		this.parada = parada;
	}
	@OneToMany(mappedBy="ruta_id_fk",targetEntity=Bus.class,
			cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	public List<Bus> getBus() {
		return bus;
	}
	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}	
}
