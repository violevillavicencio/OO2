package io.github.unlp_oo.archetype;

public class BasicoBuilder extends EquipoBuilder {

    public BasicoBuilder(Catalogo catalogo, String nombre) {
        super(catalogo, nombre);
    }

    @Override
    public void setProcesador() {
        presupuesto.setProcesador(
            catalogo.getComponente("Procesador Basico")
        );
    }

    @Override
    public void setMemoriaRAM() {
        presupuesto.setMemoriaRAM(
            catalogo.getComponente("8 GB")
        );
    }

    @Override
    public void setDisco() {
        presupuesto.setDisco(
            catalogo.getComponente("HDD 500 GB")
        );
    }

    @Override
    public void setTarjetaGrafica() {
        presupuesto.setTarjetaGrafica(
            catalogo.getComponente("Integrada")
        );
    }

    @Override
    public void setGabinete() {
        presupuesto.setGabinete(
            catalogo.getComponente("Gabinete Estandar")
        );
    }
    
}
