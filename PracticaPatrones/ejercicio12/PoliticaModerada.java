package io.github.unlp_oo.archetype;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PoliticaModerada implements PoliticaDeCancelacion {

    @Override
    public double montoAReembolsar(LocalDate fechaCancelacion, Reserva reserva) {
        long dias = ChronoUnit.DAYS.between(fechaCancelacion, reserva.getFechaInicio()); 
        double monto = reserva.montoAPagar(); 
        if (dias >= 7) {
            return monto;
        }
        if (dias >= 2) {
            return monto * 0.5;
        }
        return 0;
    }
    
}
