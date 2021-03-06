package com.youtube.demo.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "rol")
@Access(AccessType.FIELD)
public class Rol extends ParentEntity {
	
	
	private static final long serialVersionUID = 1L;
	@Column(name = "nombre")
	private String nombre;
	
    @OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
    private Set<User> users;
    
    Rol(){
    	
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    

}
