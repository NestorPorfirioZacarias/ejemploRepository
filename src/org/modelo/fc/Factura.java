package org.modelo.fc;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Factura {
	private int id;
	private Date fecha;
	private Time hora;
	private int cantidadproducto;
	private int total;
	private Clientex clientex_id_fk;
	@Id
	@Column(nullable=false)
	@GeneratedValue
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public int getCantidadproducto() {
		return cantidadproducto;
	}
	public void setCantidadproducto(int cantidadproducto) {
		this.cantidadproducto = cantidadproducto;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@ManyToOne
	@JoinColumn(name="clientex_id_fk")
	
	public Clientex getClientex_id_fk() {
		return clientex_id_fk;
	}
	public void setClientex_id_fk(Clientex clientex_id_fk) {
		this.clientex_id_fk = clientex_id_fk;
	}
	
}
