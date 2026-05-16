package io.github.unlp_oo.archetype;

import java.time.LocalDate;

public class PoliticaFlexible implements PoliticaDeCancelacion {

	@Override
	public double montoAReembolsar(LocalDate fechaCancelacion, Reserva reserva) {
		if (fechaCancelacion.isBefore(reserva.getFechaInicio())) {
			return reserva.montoAPagar();
		}
		return 0;
	}

}
