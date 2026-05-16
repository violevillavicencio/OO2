package io.github.unlp_oo.archetype;

import java.time.LocalDate;

public interface PoliticaDeCancelacion {

	public double montoAReembolsar(LocalDate fechaCancelacion, Reserva reserva);
	
}
