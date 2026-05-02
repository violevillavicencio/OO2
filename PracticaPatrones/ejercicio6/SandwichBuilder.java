package io.github.unlp_oo.archetype;

public abstract class SandwichBuilder {
    protected Sandwich sandwich;

    public SandwichBuilder() {
        sandwich = new Sandwich();
    }

    public abstract void buildPan();
    public abstract void buildAderezo();
    public abstract void buildPrincipal();
    public abstract void buildAdicional();

    public Sandwich getSandwich() {
        return sandwich;
    }
}
