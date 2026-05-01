package io.github.unlp_oo.archetype;

public class EmpleadoPasante extends Empleado{
	private int cantExamenesRendidos;
	
	public EmpleadoPasante(int cantExamenesRendidos) {
		this.cantExamenesRendidos = cantExamenesRendidos;
	}

	@Override
	public double sueldoBasico() {
		return 20000;
	}

	@Override
	public double calcularAdicionales() {
		return this.cantExamenesRendidos * 2000;
	}
	
}
