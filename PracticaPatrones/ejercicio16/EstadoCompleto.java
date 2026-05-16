package io.github.unlp_oo.archetype;

public class EstadoCompleto extends EstadoExcursion {

    @Override
    public void inscribir(Usuario usuario,Excursion excursion) {
        excursion.agregarListaEspera(usuario);
    }

    @Override
    protected String informacionExtra(Excursion excursion) {
        return "";
    }
    
}
