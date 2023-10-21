package com.tonifernandez.gestionproductos.backend.business.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


//Serializable es un obejcte suseptible d'entar i sortir de memòria (info pel compilador)
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nombre;
	private String descripcion;
	private Double precio; //Utilitzem la classe Double per si els prod admeten null
	private Familia familia;
	private Date fechaAlta;
	private boolean descatalogado;
	
	public Producto () {
		
	}

	
	

	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
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




	public Double getPrecio() {
		return precio;
	}




	public void setPrecio(Double precio) {
		this.precio = precio;
	}




	public Familia getFamilia() {
		return familia;
	}




	public void setFamilia(Familia familia) {
		this.familia = familia;
	}




	public Date getFechaAlta() {
		return fechaAlta;
	}




	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}




	public boolean isDescatalogado() {
		return descatalogado;
	}




	public void setDescatalogado(boolean descatalogado) {
		this.descatalogado = descatalogado;
	}




	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(id, other.id);
	}




	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", familia=" + familia + ", fechaAlta=" + fechaAlta + ", descatalogado=" + descatalogado + "]";
	}

	
	
}
