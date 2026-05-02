package io.github.unlp_oo.archetype;

public class SandwichDirector {
	private SandwichBuilder builder;
	
    public Sandwich construir(SandwichBuilder builder) {
    	this.builder.buildPan();
        this.builder.buildAderezo();
        this.builder.buildPrincipal();
        this.builder.buildAdicional();
        return this.builder.getSandwich();
    }

}
