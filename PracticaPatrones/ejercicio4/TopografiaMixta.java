package io.github.unlp_oo.archetype;

import java.util.List;

public class TopografiaMixta extends Topografia {
    private List<Topografia> partes;

    public TopografiaMixta(List<Topografia> componentes) {
        this.componentes = componentes;
    }
    
   @Override
    public double proporcionAgua() {
        return partes.stream()
                .mapToDouble(p -> p.proporcionAgua() )
                .sum() / 4;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof TopografiaMixta)) return false;

        TopografiaMixta otra = (TopografiaMixta) obj;

        return this.partes.equals(otra.partes);
    }
}
