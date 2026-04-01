package io.github.unlp_oo.archetype;

public interface Jugada {
	
	public String jugarContra(Jugada otrajugada);
	
	public String jugarContraPiedra();
	
	public String jugarContraPapel();
	
	public String jugarContraTijera();
	
	public String jugarContraLagarto();
	
	public String jugarContraSpock();

	// en el segundo punto la complejidad es la de agregar un elemento en la jugada. Hay que modificar la interfaz y cada una de las clases que 
	// la implementan, esto lo vamos a poder resolver con un patron más adelante..
}
