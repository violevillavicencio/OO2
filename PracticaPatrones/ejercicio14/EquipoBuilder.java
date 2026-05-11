package io.github.unlp_oo.archetype;

public abstract class EquipoBuilder {
	protected Presupuesto presupuesto;
	protected Catalogo catalogo; 

	public EquipoBuilder(Catalogo catalogo, String nombre) {
		this.catalogo = catalogo;
		this.presupuesto = new Presupuesto(nombre);
	}

	public abstract void setProcesador();
	
	public abstract void setMemoriaRAM();
	
	public abstract void setDisco();
	
	public abstract void setTarjetaGrafica();
	
	public abstract void setGabinete();
	
	public Presupuesto getPresupuesto() {
		return this.presupuesto;
	}
	
}
