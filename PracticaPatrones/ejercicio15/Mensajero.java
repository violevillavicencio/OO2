package io.github.unlp_oo.archetype;

public class Mensajero {
	private Cifrador cifrador;

	public Mensajero(Cifrador cifrador) {
		this.cifrador = cifrador;
	}

	public void setCifrador(Cifrador cifrador) {
		this.cifrador = cifrador;
	}

	public String enviar(String mensaje) {
        return cifrador.cifrar(mensaje);
	}

	public String recibir(String mensaje) {
		return cifrador.descifrar(mensaje);
	}
}
