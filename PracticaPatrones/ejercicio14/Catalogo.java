package io.github.unlp_oo.archetype;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
	private List<Componente> componentes; 
	
	public Catalogo() {
		componentes = new ArrayList<Componente>();
	}	
	
	public Componente getComponente(String descripcion) {
		return componentes.stream()
				.filter(elem -> elem.getNombre().equals(descripcion))
				.findFirst()
				.orElse(null);
	}
	
}
