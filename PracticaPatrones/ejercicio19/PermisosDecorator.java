package io.github.unlp_oo.archetype;

public class PermisosDecorator extends FileDecorator {

    public PermisosDecorator(Archivo componente) {
        super(componente);
    }

    @Override
    public String prettyPrint() {
        return componente.prettyPrint()
                + " - "
                + this.getFile().getPermisos();
    }
    
}
