package io.github.unlp_oo.archetype;

public class FeistelAdapter implements Cifrador {
	private FeistelCipher feistel;
	
	public FeistelAdapter(String key) {
        this.feistel = new FeistelCipher(key);
    }
	
    @Override
    public String cifrar(String mensaje) {
        return feistel.encode(mensaje);
    }

    @Override
    public String descifrar(String mensaje) {
        return feistel.encode(mensaje);
    }
}
