package io.github.unlp_oo.archetype;

public abstract class EstadoExcursion {
	
    public abstract void inscribir(Usuario usuario,Excursion excursion);

    public String obtenerInformacion(Excursion excursion) {
        return excursion.informacionBasica() + this.informacionExtra(excursion);
    }

    protected abstract String informacionExtra(Excursion excursion);
}
