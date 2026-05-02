package io.github.unlp_oo.archetype;

public abstract class Topografia {

    public abstract double proporcionAgua();

    public double proporcionTierra() {
        return 1 - this.proporcionAgua();
    }

    @Override
    public abstract boolean equals(Object obj);
}
