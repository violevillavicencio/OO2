package io.github.unlp_oo.archetype;

public class VeganoBuilder extends SandwichBuilder {

    public void buildPan() {
    	sandwich.setPan(100); 
    }
    
    public void buildAderezo() { 
    	sandwich.setAderezo(20); 
    }
    
    public void buildPrincipal() { 
    	sandwich.setPrincipal(500);
    }
    
    public void buildAdicional() { 
    	sandwich.setAdicional(0); 
    }
    
}
