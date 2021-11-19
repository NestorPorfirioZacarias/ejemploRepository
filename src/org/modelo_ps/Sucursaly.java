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
public class Sucursaly {
	private int idsuc;
	private String Nombre;
	private String direccion;
	private String tel;
	private String email;
	private List<Productoy> productoys =  new ArrayList<Productoy>();
	@Id
	@Column(nullable=false)
	@GeneratedValue
	public int getIdsuc() {
		return idsuc;
	}
	public void setIdsuc(int idsuc) {
		this.idsuc = idsuc;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@ManyToMany
	@JoinTable(name="proysucy",
				joinColumns= {@JoinColumn(name="idsy")},
				inverseJoinColumns= {@JoinColumn(name="idpy")})
	
	public List<Productoy> getProductoys() {
		return productoys;
	}
	public void setProductoys(List<Productoy> productoys) {
		this.productoys = productoys;
	}

}
