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
	
	public void setProcesador(Componente componente) { 
		componentes.add(componente);
	}
	
	public void setMemoriaRAM(Componente componente) {
		componentes.add(componente);
	}	
	public void setDisco(Componente componente) {
		componentes.add(componente);
	}
	
	public void setTarjetaGrafica(Componente componente) {
		componentes.add(componente);
	}
	public void setGabinete(Componente componente) {
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

}
