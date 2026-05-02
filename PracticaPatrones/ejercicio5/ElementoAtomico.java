package io.github.unlp_oo.archetype;

//elementoAtomico es el atomo individual o sea la hoja/leaf
public class ElementoAtomico extends ElementoQuimico{
	private int pesoAtomico;
	private int cargaElectrica;
	private boolean esMetal;
	private String simbolo;
	
	public ElementoAtomico(String simbolo, int pesoAtomico, int cargaElectrica, boolean esMetal) {
		this.pesoAtomico = pesoAtomico;
		this.cargaElectrica = cargaElectrica;
		this.esMetal = esMetal;
		this.simbolo = simbolo;
	}
	
	//caso base: devuelve su propio valor
	public double pesoAtomico(){
		return this.pesoAtomico;
	}
	
	public  double cargaElectrica(){
		return this.cargaElectrica;
	}
	
	public boolean esMetal(){
		return this.esMetal;
	}
	
	public String getFormula(){
		return this.simbolo;
	}
	
	public boolean esValida(){
		return true; //un atomo siempre es valido
	}
	
	
}
