package io.github.unlp_oo.archetype;

import java.util.List;

public class Usuario {
	private String nombre;
	private List<AutoEnAlquiler> autosEnAlquiler; 
	
	public Usuario(String nombre, List<AutoEnAlquiler> autosEnAlquiler) {
		this.nombre = nombre;
		this.autosEnAlquiler = autosEnAlquiler;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<AutoEnAlquiler> getAutosEnAlquiler() {
		return autosEnAlquiler;
	}
	
}
