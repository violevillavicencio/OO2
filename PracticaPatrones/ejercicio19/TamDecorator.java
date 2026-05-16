package io.github.unlp_oo.archetype;

public class TamDecorator extends FileDecorator {

	    public TamDecorator(Archivo componente) {
	        super(componente);
	    }

	    @Override
	    public String prettyPrint() {
	        return componente.prettyPrint()
	                + " - "
	                + this.getFile().getTam();
	    }
	    
}
