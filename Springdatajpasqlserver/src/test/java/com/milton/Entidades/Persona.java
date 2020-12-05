package com.milton.Entidades;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="persona")
public class Persona implements Serializable {/**
	*
	*/
	private static final long SeriaVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private long  id_persona;
	private String nombre ;
	private String apellido;
	private String email;
	
	
	public long getId_persona() {
		return id_persona;
	}
	public void setId_persona(long id_persona) {
		this.id_persona = id_persona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public static long getSeriaversionuid() {
		return SeriaVersionUID;
	}
	private String telefono;

}
