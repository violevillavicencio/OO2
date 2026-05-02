package io.github.unlp_oo.archetype;

public class SinTACCBuilder extends SandwichBuilder {

    public void buildPan() { 
    	sandwich.setPan(150); 
    }
    
    public void buildAderezo() { 
    	sandwich.setAderezo(18); 
    }
    
    public void buildPrincipal() { 
    	sandwich.setPrincipal(250);
    }
    
    public void buildAdicional() { 
    	sandwich.setAdicional(200);
    }
  
}
