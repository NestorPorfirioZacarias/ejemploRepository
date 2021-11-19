package org.modelo.cd;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class ciudadano {
	private int id;
	private String nombre;
	private String apaterno;
	private String amaterno;
	private String direcion;
	private DetalleCiuda detalleciuda_id_fk;
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
	public String getDirecion() {
		return direcion;
	}
	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="detalleciuda_id_fk")
	
	public DetalleCiuda getDetalleciuda_id_fk() {
		return detalleciuda_id_fk;
	}
	public void setDetalleciuda_id_fk(DetalleCiuda detalleciuda_id_fk) {
		this.detalleciuda_id_fk = detalleciuda_id_fk;
	}
}
