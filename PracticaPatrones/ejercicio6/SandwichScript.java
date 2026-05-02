package io.github.unlp_oo.archetype;

public class SandwichScript {
	
    public static void main(String[] args) {

        SandwichDirector director = new SandwichDirector();

        Sandwich clasico = director.construir(new ClasicoBuilder());
        Sandwich vegano = director.construir(new VeganoBuilder());

        System.out.println("Clásico: " + clasico.getPrecio());
        System.out.println("Vegano: " + vegano.getPrecio());
    }
    
}
