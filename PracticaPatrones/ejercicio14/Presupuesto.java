package io.github.unlp_oo.archetype;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private List<Componente> componentes;
	private String nombre;
	private LocalDate fechaSolicitud;
	
	public Presupuesto(String nombre) {
		this.componentes = new ArrayList<>();
		this.nombre = nombre;
		this.fechaSolicitud = LocalDate.now();
	}
	
	public void addComponente(Componente componente) {
		componentes.add(componente); 
	}
	
	public double calcularConsumo() {
		return this.componentes.stream()
				.mapToDouble(comp -> comp.getConsumo())
				.sum();
	}
	
	public double calcularPrecio() {
		return this.componentes.stream()
				.mapToDouble(comp -> comp.getPrecio())
				.sum();	
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaSolicitud() {
		return fechaSolicitud;
	}

}
