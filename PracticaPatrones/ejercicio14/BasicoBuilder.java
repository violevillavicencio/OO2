package io.github.unlp_oo.archetype;

public class BasicoBuilder extends EquipoBuilder {

    public BasicoBuilder(Catalogo catalogo, String nombre) {
        super(catalogo, nombre);
    }

    @Override
    public void setProcesador() {
        presupuesto.addComponente(
            catalogo.getComponente("Procesador Basico")
        );
    }

    @Override
    public void setMemoriaRAM() {
        presupuesto.addComponente(
            catalogo.getComponente("8 GB")
        );
    }

    @Override
    public void setDisco() {
        presupuesto.addComponente(
            catalogo.getComponente("HDD 500 GB")
        );
    }

    @Override
    public void setTarjetaGrafica() {
        presupuesto.addComponente(
            catalogo.getComponente("Integrada")
        );
    }

    @Override
    public void setGabinete() {
        presupuesto.addComponente(
            catalogo.getComponente("Gabinete Estandar")
        );
    }
    
}
