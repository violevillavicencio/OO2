package io.github.unlp_oo.archetype;

public class VegetarianoBuilder extends SandwichBuilder {

    public void buildPan() { 
    	sandwich.setPan(120); 
    }
    
    public void buildAderezo() { 
    	sandwich.setAderezo(0); 
    }
    
    public void buildPrincipal() { 
    	sandwich.setPrincipal(200);
    }
    
    public void buildAdicional() { 
    	sandwich.setAdicional(100); 
    }
    
}
