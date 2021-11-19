package org.modelo.ph;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Habitante {
	private int id;
	private String nombre;
	private String apaterno;
	private String amaterno;
	private Poblacion habitante_id_fk;
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
	public String getApaterno() {
		return apaterno;
	}
	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}
	public String getAmaterno() {
		return amaterno;
	}
	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}
	
	@ManyToOne
	@JoinColumn(name="habitante_id_fk")
	
	public Poblacion getHabitante_id_fk() {
		return habitante_id_fk;
	}
	public void setHabitante_id_fk(Poblacion habitante_id_fk) {
		this.habitante_id_fk = habitante_id_fk;
	}
}
