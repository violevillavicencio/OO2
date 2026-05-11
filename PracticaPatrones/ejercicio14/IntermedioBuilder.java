package io.github.unlp_oo.archetype;

public class IntermedioBuilder extends EquipoBuilder {

    public IntermedioBuilder(Catalogo catalogo, String nombre) {
        super(catalogo, nombre);
    }

    @Override
    public void setProcesador() {
        presupuesto.addComponente(
            catalogo.getComponente("Procesador Intermedio")
        );
    }

    @Override
    public void setMemoriaRAM() {
        presupuesto.addComponente(
            catalogo.getComponente("16 GB")
        );
    }

    @Override
    public void setDisco() {
        presupuesto.addComponente(
            catalogo.getComponente("SSD 500 GB")
        );
    }

    @Override
    public void setTarjetaGrafica() {
        presupuesto.addComponente(
            catalogo.getComponente("GTX 1650")
        );
    }

    @Override
    public void setGabinete() {
        presupuesto.addComponente(
            catalogo.getComponente("Gabinete Intermedio")
        );

        presupuesto.addComponente(
            catalogo.getComponente("Fuente 800w")
        );
    }
    
}
