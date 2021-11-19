package org.modelo.tp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Productox {
	private int id;
	private String Nombre;
	private int cantidad;
	private Ticket ticket_id_fk;
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
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="ticket_id_fk")
	public Ticket getTicket_id_fk() {
		return ticket_id_fk;
	}
	public void setTicket_id_fk(Ticket ticket_id_fk) {
		this.ticket_id_fk = ticket_id_fk;
	}
	
	
	
}
