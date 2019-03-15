package com.youtube.demo.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "proyecto")
@Access(AccessType.FIELD)
public class Proyecto extends ParentEntity {
	
	
	private static final long serialVersionUID = -6078564940072697279L;

	@Column(name = "nombre", nullable=false , length= 50)
    private String 	nombre;
	
	@Column(name = "descripcion", nullable=true , length= 300)
    private String  descripcion;
	
	@Column(name = "alias", nullable=false , length= 20, unique = true)
    private String  alias;
	
	@Column(name = "estado", nullable=true , length= 20)
    private String	estado;
	
	@Column(name = "fecha_inicio", nullable=false )
    private Date fecha_inicio;
	
	@Column(name = "fecha_fin", nullable=false)
    private Date fecha_fin;
	
	@NotNull(message="El responsable NO puede ser vacío")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private User responsable;
	

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

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public User getResponsable() {
		return responsable;
	}

	public void setResponsable(User responsable) {
		this.responsable = responsable;
	}
	
	
	
}
