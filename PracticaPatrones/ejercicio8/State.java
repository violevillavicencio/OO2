package io.github.unlp_oo.archetype;

import java.time.Duration;

public abstract class State {
	private ToDoItem tarea;
	
	public State (ToDoItem tarea) {
		this.tarea = tarea;
	}
	
	public ToDoItem getTarea() {
		return this.tarea;
	}
	
	// no lo defino como abstracto pq solo lo redefine el estado in-progress
	public void start() {};
	
	public abstract void togglePause();
	
	// lo mismo que con start
	public void finish() {};
	
	public abstract Duration workedTime();
	
	// solo lo sobreescribo cuando finalizo la tarea (unico caso donde no hace nada)
	public void addComment(String comment) {
		this.tarea.getComments().add(comment);
	}
	
}
