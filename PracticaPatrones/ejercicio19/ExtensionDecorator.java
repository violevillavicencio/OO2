package io.github.unlp_oo.archetype;

public class ExtensionDecorator extends FileDecorator {

	public ExtensionDecorator(Archivo componente) {
		super(componente);
	}
	
	@Override
	public String prettyPrint() {
		return componente.prettyPrint()
		        + " - "
		        + this.getFile().getExtension();
	}
}
