package io.github.unlp_oo.archetype;

import java.time.LocalDate;

public class PoliticaEstricta implements PoliticaDeCancelacion {

	@Override
	public double montoAReembolsar(LocalDate fechaCancelacion, Reserva reserva) {
		 return 0; 
	}

}
