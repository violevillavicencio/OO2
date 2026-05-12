package io.github.unlp_oo.archetype;

import java.util.Comparator;
import java.util.List;

public class SugerenciaPorSimilaridad implements EstrategiaSugerencia {

    @Override
    public List<Pelicula> sugerir(Decodificador deco) {
        return deco.getReproducidas().stream()
                .flatMap(pelicula -> pelicula.getSimilares().stream())
                .distinct()
                .filter(p ->!deco.getReproducidas().contains(p))
                .sorted(Comparator.comparing(Pelicula::getEstreno)
                		.reversed()
                )
                .limit(3)
                .toList();
    }
    
}
