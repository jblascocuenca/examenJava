package com.examen.entidades;

import java.util.Date;

public class Colega {

	
	private int id;
	private String nombre;
	private String ciudad;
	private Date fecha;
	
	public Colega(int id, String nombre, String ciudad, Date fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.fecha = fecha;
	}
	
	public Colega(String nombre, String ciudad, Date fecha) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.fecha = fecha;
	}


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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Colega))
			return false;
		Colega other = (Colega) obj;
		if (ciudad == null) {
			if (other.ciudad != null)
				return false;
		} else if (!ciudad.equals(other.ciudad))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Colega [id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + ", fecha=" + fecha + "]";
	}
	
	
	
	
}
