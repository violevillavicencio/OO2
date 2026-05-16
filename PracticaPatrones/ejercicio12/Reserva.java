package io.github.unlp_oo.archetype;

import java.time.LocalDate;

public class Reserva {
	private int cantidadDias; 
	private LocalDate fechaInicio; 
	private Usuario conductor; 
	private AutoEnAlquiler auto; 
	
	public Reserva(int cantidadDias, LocalDate fechaInicio, Usuario conductor, AutoEnAlquiler auto) {
		this.cantidadDias = cantidadDias;
		this.fechaInicio = fechaInicio;
		this.conductor = conductor;
		this.auto = auto;
	}

	public double montoAPagar() {
		return auto.getPrecioPorDia() * cantidadDias; 
	}
	
	public double montoAReembolsar(LocalDate fechaCancelacion) {
		return auto.getTipoPolitica().montoAReembolsar(fechaCancelacion,this);
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public AutoEnAlquiler getAuto() {
		return auto;
	}

	public Usuario getConductor() {
		return conductor;
	}
	
}
