package io.github.unlp_oo.archetype;

public class Usuario {
	private String nombre, apellido, email;

	public Usuario(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getEmail() {
		return email;
	} 
	
}
