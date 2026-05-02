package io.github.unlp_oo.archetype;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//conjunto de elementos COMPOSITE
public class UnionQuimica extends ElementoQuimico {
	private List<ElementoQuimico> elementos; //hijos
	
	public UnionQuimica() {
	    this.elementos = new ArrayList<>();
	}
	
	public void add(ElementoQuimico e) {
	    this.elementos.add(e);
	}
		
	public int cantidadElementos(){
		return this.elementos.size();
	}
	
	public double pesoAtomico(){
		return this.elementos.stream().mapToDouble(e -> e.pesoAtomico()).sum(); //DELEGA en los hijos
	}
	
	//tambien delegacion 
	public  double cargaElectrica(){
		return this.elementos.stream().mapToDouble(e -> e.cargaElectrica()).sum();
	}
	
	public boolean esMetal(){
		return this.elementos.stream().allMatch(e -> e.esMetal());
	}
	
	public String getFormula(){
		return this.elementos.stream().map(e -> e.getFormula()).collect(Collectors.joining(""));
	}
	
	private boolean esValidaLaLista(){
		return this.elementos.stream().allMatch(e -> e.esValida());
	}
	
	public boolean esValida(){
		if (!this.esValidaLaLista())
			return false;
			long cantidadMetales = this.elementos.stream().filter(e -> e.esMetal()).count();
		return cantidadMetales <= 1;
	}
	
	public String tipoUnion() {
	    if (this.cargaElectrica() == 0) {
	        return "molécula";
	    }
	    return "es un ion, no neutro";
	}
}
