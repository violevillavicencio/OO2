package io.github.unlp_oo.archetype;

public class EstadoProvisorio extends EstadoExcursion {

    @Override
    public void inscribir(Usuario usuario,Excursion excursion) {
        excursion.agregarInscripto(usuario);
        if (excursion.getInscriptos().size()>= excursion.getCupoMin()) {
            excursion.setEstado(new EstadoDefinitivo());
        }
    }

    @Override
    protected String informacionExtra(Excursion excursion) {
        return "\nFaltan " + (excursion.getCupoMin() - excursion.getInscriptos().size()) +
               " usuarios para alcanzar el cupo mínimo";
    }
}
