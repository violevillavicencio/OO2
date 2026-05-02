package io.github.unlp_oo.archetype;

//component Define la interfaz comun y permite tratar igual a atomo o union
public abstract class ElementoQuimico {
	
	//operaciones comunes a todo (atomo o union)
	public abstract double pesoAtomico();
	public abstract double cargaElectrica();
	public abstract boolean esMetal();
	
	// metodo derivado, reutiliza comportamiento
	public boolean noEsMetal(){
		return !this.esMetal();
	}
	public abstract String getFormula();
	
	public abstract boolean esValida();
}
