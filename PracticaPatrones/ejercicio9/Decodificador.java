package io.github.unlp_oo.archetype;
import java.util.ArrayList;
import java.util.List;

public class Decodificador {
    private List<Pelicula> grilla;
    private List<Pelicula> reproducidas;
    private EstrategiaSugerencia estrategia;

    public Decodificador() {
        this.grilla = new ArrayList<>();
        this.reproducidas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        this.grilla.add(pelicula);
    }

    public void reproducir(Pelicula pelicula) {
        this.reproducidas.add(pelicula);
    }

    public List<Pelicula> sugerirPeliculas() {
        return estrategia.sugerir(this);
    }

    public void setEstrategia(EstrategiaSugerencia estrategia) {
        this.estrategia = estrategia;
    }

    public List<Pelicula> getGrilla() {
        return grilla;
    }

    public List<Pelicula> getReproducidas() {
        return reproducidas;
    }
}
