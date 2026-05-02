package io.github.unlp_oo.archetype;

public class TopografiaTierra extends Topografia {

    public double proporcionAgua() {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof TopografiaTierra;
    }
}
