package io.github.unlp_oo.archetype;

public class IntermedioBuilder extends EquipoBuilder {

    public IntermedioBuilder(Catalogo catalogo, String nombre) {
        super(catalogo, nombre);
    }

    @Override
    public void setProcesador() {
        presupuesto.setProcesador(
            catalogo.getComponente("Procesador Intermedio")
        );
    }

    @Override
    public void setMemoriaRAM() {
        presupuesto.setMemoriaRAM(
            catalogo.getComponente("16 GB")
        );
    }

    @Override
    public void setDisco() {
        presupuesto.setDisco(
            catalogo.getComponente("SSD 500 GB")
        );
    }

    @Override
    public void setTarjetaGrafica() {
        presupuesto.setTarjetaGrafica(
            catalogo.getComponente("GTX 1650")
        );
    }

    @Override
    public void setGabinete() {
        presupuesto.setGabinete(
            catalogo.getComponente("Gabinete Intermedio")
        );

        presupuesto.setGabinete(
            catalogo.getComponente("Fuente 800w")
        );
    }
    
}
