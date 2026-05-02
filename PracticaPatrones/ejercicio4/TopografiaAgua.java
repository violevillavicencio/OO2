package io.github.unlp_oo.archetype;

public class TopografiaAgua extends Topografia {

    public double proporcionAgua() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof TopografiaAgua;
    }
}
