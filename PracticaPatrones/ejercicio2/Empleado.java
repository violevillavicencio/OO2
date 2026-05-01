package io.github.unlp_oo.archetype;

public abstract class Empleado {
	
	// todos pueden responder a este mensaje calculandolo independientemente 
	// con el resultado de cada uno de los metodos que devuelven lo indicado segun el empleado 
	public double sueldo() {
		return this.sueldoBasico() + this.calcularAdicionales() - this.calcularDescuentos();
	}
	
	protected abstract double sueldoBasico();
	
	protected abstract double calcularAdicionales();
	
	//el descuento es igual para todos los empleados 13% del sueldo básico
	// 13% del sueldo basico + 5% del sueldo adicional
	public double calcularDescuentos() {
		return this.sueldoBasico() * 0.13 + this.calcularAdicionales() * 0.05;
	}
}
