package io.github.unlp_oo.archetype;

import java.util.stream.Collectors;

public class EstadoDefinitivo extends EstadoExcursion {

    @Override
    public void inscribir(Usuario usuario, Excursion excursion) {
        excursion.agregarInscripto(usuario);
        if (excursion.getInscriptos().size() == excursion.getCupoMax()) {
            excursion.setEstado(new EstadoCompleto());
        }
    }

    @Override
    protected String informacionExtra(Excursion excursion) {
        String mails = excursion.getInscriptos()
                        .stream().map(Usuario::getEmail)
                         .collect(Collectors.joining(", "));
        return "\nMails: "
                + mails
                + "\nFaltan "
                + (excursion.getCupoMax()- excursion.getInscriptos().size())
                + " usuarios para el cupo máximo";
    }
}
