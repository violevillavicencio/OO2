package ar.edu.unlp.info.oo1.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter{
	
	/* Twitter debe conocer a todos los usuarios del sistema.*/
	private List<Usuario> usuarios; 

	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}

	public Usuario crearUsuario(String screenName) {
		Usuario user = null;
		if (!existeUsuario(screenName)) {
			user = new Usuario (screenName);
			this.usuarios.add(user);
		}
		return user;
	}
	
	/* Los tweets de un usuario se deben eliminar cuando el usuario es eliminado.
	 *  No existen tweets no referenciados por un usuario.*/
	
	public void eliminarUsuario (Usuario user) {
		if (user!= null && existeUsuario(user.getScreenName())) {
			
			// tengo todos los tweets del usuario a eliminar 
			List <Tweet> lisTweets = user.getTweets();
			
			// recorro todos los usuario de twitter y remuevo los retweets que le dieron usando la lista anterior
			this.usuarios.stream().forEach(u -> u.removerRetweets(lisTweets));
			
		    // elimino sus tweets y retweets 
			user.eliminarPublicaciones();
			this.usuarios.remove(user);
		}
	}
	
	private boolean existeUsuario (String screenName) {
		return this.usuarios.stream().anyMatch(usuario -> usuario.getScreenName().equals(screenName));
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	
}
