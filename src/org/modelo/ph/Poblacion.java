package org.modelo.ph;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Poblacion {
	private int id;
	private String codigo;
	private String Nombre;
	private List<Habitante> habitantes;
	@Id
	@Column(nullable=false)
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	@OneToMany(mappedBy="habitante_id_fk",targetEntity=Habitante.class,
				cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	
	public List<Habitante> getHabitantes() {
		return habitantes;
	}
	public void setHabitantes(List<Habitante> habitantes) {
		this.habitantes = habitantes;
	}
	
	
	
	
	
	//private Habitante id_poblacion_fk;

	
	//@ManyToOne
	//@JoinColumn(name="id_poblacion_fk")
	
	
	
}
