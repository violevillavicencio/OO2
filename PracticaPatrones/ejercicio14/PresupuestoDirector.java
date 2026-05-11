package io.github.unlp_oo.archetype;

public class PresupuestoDirector {
    private EquipoBuilder builder;

    public PresupuestoDirector(EquipoBuilder builder) {
        this.builder = builder;
    }

    public Presupuesto build() {
        builder.setProcesador();
        builder.setMemoriaRAM();
        builder.setDisco();
        builder.setTarjetaGrafica();
        builder.setGabinete();
        return builder.getPresupuesto();
    }
    
}
