package io.github.unlp_oo.archetype;

public class FechaCreacionDecorator extends FileDecorator {

    public FechaCreacionDecorator(Archivo componente) {
        super(componente);
    }

    @Override
    public String prettyPrint() {
        return componente.prettyPrint()
                + " - "
                + this.getFile()
                .getFechaCreacion();
    }
  
}
