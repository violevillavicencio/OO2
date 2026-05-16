package io.github.unlp_oo.archetype;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
	private String nombre; 
	private LocalDate fechaInicio, fechaFin; 
	private String puntoDeEncuentro; 
	private double costo; 
	private int cupoMax, cupoMin;
	private List<Usuario> inscriptos;
	private List<Usuario> espera;
	private EstadoExcursion estado;
	
	public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoDeEncuentro, double costo, int cupoMax, int cupoMin) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.costo = costo;
		this.cupoMax = cupoMax;
		this.cupoMin = cupoMin;
	    this.inscriptos = new ArrayList<>();
	    this.espera = new ArrayList<>();
	    this.estado = new EstadoProvisorio();
	}
	
	public void agregarInscripto(Usuario unUsuario) {
		this.inscriptos.add(unUsuario);
	}
	
	public void agregarListaEspera(Usuario unUsuario) {
		this.espera.add(unUsuario);
	}
	
	public void inscribir(Usuario unUsuario) { 
		this.estado.inscribir(unUsuario, this);
	}
	
	public String obtenerInformacion() { 
		return this.estado.obtenerInformacion(this); 
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public String getPuntoDeEncuentro() {
		return puntoDeEncuentro;
	}

	public double getCosto() {
		return costo;
	}

	public int getCupoMax() {
		return cupoMax;
	}

	public int getCupoMin() {
		return cupoMin;
	}
	
	public List<Usuario> getInscriptos() {
		return inscriptos;
	}

	public void setEstado(EstadoExcursion estado) { 
		this.estado = estado; 
	}
    
	public String informacionBasica() {
	    return "Nombre: " + nombre
	            + "\nCosto: " + costo
	            + "\nFecha inicio: " + fechaInicio
	            + "\nFecha fin: " + fechaFin
	            + "\nPunto encuentro: "
	            + puntoDeEncuentro;
	}
	
}
