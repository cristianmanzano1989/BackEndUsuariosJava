package com.youtube.demo.model;

import java.sql.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tarea")
@Access(AccessType.FIELD)
public class Tarea extends ParentEntity {
	
	private static final long serialVersionUID = -209069308953668763L;

	@Column(name = "nombre", nullable=false , length= 40)
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
	
	@NotNull(message="El usuario asignado NO puede ser vacío")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private User usuario_asignado;
	
	@Column(name = "tiempo_tarea", nullable=true , length= 20)
    private String	tiempo_tarea;
	
	@Column(name = "avance", nullable=true , length= 20)
    private String	avance;
	
	@NotNull(message="El Proyecto NO puede ser vacío")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn
	@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
	private Proyecto proyecto;
	
	Tarea(){
		
	}

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

	public User getUsuario_asignado() {
		return usuario_asignado;
	}

	public void setUsuario_asignado(User usuario_asignado) {
		this.usuario_asignado = usuario_asignado;
	}

	public String getTiempo_tarea() {
		return tiempo_tarea;
	}

	public void setTiempo_tarea(String tiempo_tarea) {
		this.tiempo_tarea = tiempo_tarea;
	}

	public String getAvance() {
		return avance;
	}

	public void setAvance(String avance) {
		this.avance = avance;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
	
	
	
	
}
