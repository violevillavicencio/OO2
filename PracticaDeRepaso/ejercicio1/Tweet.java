package ar.edu.unlp.info.oo1.ejercicio1;

public class Tweet implements Publicacion{
	
	private String texto; 
	
	public Tweet (String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public boolean esRetweet() {
		return false;
	}
	
}
