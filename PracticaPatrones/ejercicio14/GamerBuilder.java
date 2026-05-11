package io.github.unlp_oo.archetype;

public class GamerBuilder extends EquipoBuilder {

    public GamerBuilder(Catalogo catalogo, String nombre) {
        super(catalogo, nombre);
    }

    @Override
    public void setProcesador() {
        presupuesto.setProcesador(
            catalogo.getComponente("Procesador Gamer")
        );
        presupuesto.setProcesador(
            catalogo.getComponente("Pad termico")
        );

        presupuesto.setProcesador(
            catalogo.getComponente("Cooler")
        );
    }

    @Override
    public void setMemoriaRAM() {
        presupuesto.setMemoriaRAM(
            catalogo.getComponente("32 GB")
        );
        presupuesto.setMemoriaRAM(
            catalogo.getComponente("32 GB")
        );
    }

    @Override
    public void setDisco() {
        presupuesto.setDisco(
            catalogo.getComponente("SSD 500 GB")
        );
        presupuesto.setDisco(
            catalogo.getComponente("SSD 1 TB")
        );
    }

    @Override
    public void setTarjetaGrafica() {
        presupuesto.setTarjetaGrafica(
            catalogo.getComponente("RTX 4090")
        );
    }

    @Override
    public void setGabinete() {
        presupuesto.setGabinete(
            catalogo.getComponente("Gabinete Gamer")
        );
        
        double consumo = presupuesto.calcularConsumo();

        double fuenteNecesaria = consumo * 1.5;
        presupuesto.setGabinete(
            catalogo.getComponente(
                "Fuente " + fuenteNecesaria + " w"
            )
        );
    }
    
}
