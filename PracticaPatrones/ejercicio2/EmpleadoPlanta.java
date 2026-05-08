package io.github.unlp_oo.archetype;

public class EmpleadoPlanta extends EmpleadoConFamilia{
	private int aniosAntiguedad;
	
	public EmpleadoPlanta (boolean esCasado, int cantHijos, int aniosAntiguedad) {
	    super(esCasado, cantHijos);
		this.aniosAntiguedad = aniosAntiguedad;
	}

	@Override
	public double sueldoBasico() {
		return 50000;
	}

    @Override
    public double calcularAdicionales() {
        return this.adicionalPorFamilia() +
               this.aniosAntiguedad * 2000;
    }
}
