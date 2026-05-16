package io.github.unlp_oo.archetype;

public abstract class FileDecorator implements Archivo {
	protected Archivo componente;
	
	public FileDecorator(Archivo componente) {
		this.componente = componente;
	}
	
	@Override
	public FileOO2 getFile() {
		return componente.getFile();
	}
	
}
