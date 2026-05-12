package io.github.unlp_oo.archetype;

public class StrategyMain {

    public static void main(String[] args) {

        Pelicula thor = new Pelicula("Thor", 7.9, 2007);

        Pelicula capitanAmerica = new Pelicula("Capitan America", 7.8, 2016);

        Pelicula ironMan = new Pelicula("Iron Man", 7.9, 2010);

        Pelicula dunkirk = new Pelicula("Dunkirk", 7.9, 2017);

        Pelicula rocky = new Pelicula("Rocky", 8.1, 1976);

        Pelicula rambo = new Pelicula("Rambo", 7.8, 1979);

        // Relaciones de similaridad

        thor.agregarSimilar(capitanAmerica);
        thor.agregarSimilar(ironMan);

        rocky.agregarSimilar(rambo);

        // Decodificador

        Decodificador deco = new Decodificador();

        deco.agregarPelicula(thor);
        deco.agregarPelicula(capitanAmerica);
        deco.agregarPelicula(ironMan);
        deco.agregarPelicula(dunkirk);
        deco.agregarPelicula(rocky);
        deco.agregarPelicula(rambo);

        // Reproducidas

        deco.reproducir(thor);
        deco.reproducir(rocky);

        // NOVEDAD


        deco.setEstrategia(
                new SugerenciaPorNovedad()
        );

        System.out.println(
                "Sugerencias por novedad:"
        );

        System.out.println(
                deco.sugerirPeliculas()
        );

        // SIMILARIDAD
  
        deco.setEstrategia(
                new SugerenciaPorSimilaridad()
        );

        System.out.println(
                "Sugerencias por similaridad:"
        );

        System.out.println(
                deco.sugerirPeliculas()
        );

        // PUNTAJE
  
        deco.setEstrategia(
                new SugerenciaPorPuntaje()
        );

        System.out.println(
                "Sugerencias por puntaje:"
        );

        System.out.println(
                deco.sugerirPeliculas()
        );
    }
}
