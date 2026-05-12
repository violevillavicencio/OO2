package io.github.unlp_oo.archetype;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	private String titulo; 
	private int estreno; 
	private List<Pelicula> similares; 
	private double puntaje; 
	
	public Pelicula(String titulo, double puntaje, int estreno) {
		this.titulo = titulo;
		this.estreno = estreno;
		this.puntaje = puntaje;
		this.similares = new ArrayList<Pelicula>();
	}	
	
	// si no esta en mis similares la agrego y le digo a la pelicula agregame como similar 
	public void agregarSimilar(Pelicula pelicula) {
		if (!this.similares.contains(pelicula)) {
			this.similares.add(pelicula);
			pelicula.agregarSimilar(this);
		}
	}
	
	public String getTitulo() {
		return titulo;
	}

	public int getEstreno() {
		return estreno;
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}

	public double getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(double puntaje) {
		this.puntaje = puntaje;
	}
	
	@Override
	public String toString() {
	    return this.titulo;
	}
	
}
