package io.github.unlp_oo.archetype;

public class EmpleadoTemporario extends EmpleadoConFamilia{
	private int cantHorasTrabajadas;
	
	public EmpleadoTemporario(int cantHorasTrabajadas, int cantHijos, boolean esCasado) {
		super(esCasado, cantHijos);
		this.cantHorasTrabajadas = cantHorasTrabajadas;
	}

	@Override
	public double sueldoBasico() {
		return 20000 + this.cantHorasTrabajadas * 300;
	}

    @Override
    public double calcularAdicionales() {
        return this.adicionalPorFamilia();
    }
	
}
