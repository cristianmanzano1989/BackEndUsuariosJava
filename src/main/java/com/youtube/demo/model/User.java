package com.youtube.demo.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuario")
@Access(AccessType.FIELD)
public class User extends ParentEntity {


	private static final long serialVersionUID = 8435405591663518471L;
	
	@Column(name = "cedula", nullable=false , length= 11)
    private int 	cedula;
	
	@Column(name = "nombre", nullable=true , length= 100)
    private String  nombre;
	
	@Column(name = "email", nullable=false , length= 100)
    private String  email;
	
	@Column(name = "contrasena", nullable=true , length= 100)
    private String	contrasena;
		
	



	public String getContrasena() {
		return contrasena;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	User(){
		
	}





	public int getCedula() {
		return cedula;
	}


	public void setCedula(int cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
	
	
	
	

}
