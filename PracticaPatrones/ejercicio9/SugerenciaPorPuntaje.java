package io.github.unlp_oo.archetype;

import java.util.Comparator;
import java.util.List;

public class SugerenciaPorPuntaje implements EstrategiaSugerencia {
	
	@Override
	public List<Pelicula> sugerir(Decodificador deco) {
	
		return deco.getGrilla().stream()
	        .filter(p ->!deco.getReproducidas().contains(p))
	        .sorted(Comparator.comparing(Pelicula::getPuntaje)
	                .thenComparing(Pelicula::getEstreno)
	                .reversed())
	        .limit(3)
	        .toList();
	}
	
}
