package io.github.unlp_oo.archetype;

public class GamerBuilder extends EquipoBuilder {

    public GamerBuilder(Catalogo catalogo, String nombre) {
        super(catalogo, nombre);
    }

    @Override
    public void setProcesador() {
        presupuesto.addComponente(
            catalogo.getComponente("Procesador Gamer")
        );
        presupuesto.addComponente(
            catalogo.getComponente("Pad termico")
        );

        presupuesto.addComponente(
            catalogo.getComponente("Cooler")
        );
    }

    @Override
    public void setMemoriaRAM() {
        presupuesto.addComponente(
            catalogo.getComponente("32 GB")
        );
        presupuesto.addComponente(
            catalogo.getComponente("32 GB")
        );
    }

    @Override
    public void setDisco() {
        presupuesto.addComponente(
            catalogo.getComponente("SSD 500 GB")
        );
        presupuesto.addComponente(
            catalogo.getComponente("SSD 1 TB")
        );
    }

    @Override
    public void setTarjetaGrafica() {
        presupuesto.addComponente(
            catalogo.getComponente("RTX 4090")
        );
    }

    @Override
    public void setGabinete() {
        presupuesto.addComponente(
            catalogo.getComponente("Gabinete Gamer")
        );
        
        double consumo = presupuesto.calcularConsumo();

        double fuenteNecesaria = consumo * 1.5;
        presupuesto.addComponente(
            catalogo.getComponente(
                "Fuente " + fuenteNecesaria + " w"
            )
        );
    }
    
}
