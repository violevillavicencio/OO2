package io.github.unlp_oo.archetype;

public class AutoEnAlquiler {
	private double precioPorDia; 
	private int cantidadPlazas; 
	private String marca;
	private PoliticaDeCancelacion tipoPolitica; 
	
	
	public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca, PoliticaDeCancelacion tipoPolitica) {
		this.precioPorDia = precioPorDia;
		this.cantidadPlazas = cantidadPlazas;
		this.marca = marca;
		this.tipoPolitica = tipoPolitica;
	}

	public int getCantidadPlazas() {
		return cantidadPlazas;
	}
	
	public void setCantidadPlazas(int cantidadPlazas) {
		this.cantidadPlazas = cantidadPlazas;
	}
	
	public double getPrecioPorDia() {
		return precioPorDia;
	}
	
	public String getMarca() {
		return marca;
	}

	public PoliticaDeCancelacion getTipoPolitica() {
		return tipoPolitica;
	} 
	
	public void setTipoPolitica(PoliticaDeCancelacion tipoPolitica) {
		this.tipoPolitica = tipoPolitica;
	}
	
}
