package io.github.unlp_oo.archetype;

public class ClasicoBuilder extends SandwichBuilder {

    public void buildPan() { 
    	sandwich.setPan(100);
    }
    
    public void buildAderezo() { 
    	sandwich.setAderezo(20); 
    }
    
    public void buildPrincipal() { 
    	sandwich.setPrincipal(300); 
    }
    
    public void buildAdicional() { 
    	sandwich.setAdicional(80);
    }

}
