public abstract class EmpleadoConFamilia extends Empleado {
    // atributos y comportamiento repetido entre EmpleadoTemporario y EmpleadoPlanta
    private boolean esCasado;
    private int cantHijos;

    public EmpleadoConFamilia(boolean esCasado, int cantHijos) {
        this.esCasado = esCasado;
        this.cantHijos = cantHijos;
    }

    protected double adicionalPorFamilia() {
        double adicional = this.cantHijos * 2000;
        if (this.esCasado) {
            adicional += 5000;
        }
        return adicional;
    }
}
