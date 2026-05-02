package io.github.unlp_oo.archetype;

public class Sandwich {
    private int pan;
    private int aderezo;
    private int principal;
    private int adicional;

    public void setPan(int pan) { 
    	this.pan = pan; 
    }
    
    public void setAderezo(int aderezo) { 
    	this.aderezo = aderezo; 
    }
    
    public void setPrincipal(int principal) {
    	this.principal = principal; 
    }
    
    public void setAdicional(int adicional) { 
    	this.adicional = adicional; 
    }

    public int getPrecio() {
        return pan + aderezo + principal + adicional;
    }
    
}
