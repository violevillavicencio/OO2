package io.github.unlp_oo.archetype;

import java.time.Duration;

public class Pending extends State {

	public Pending(ToDoItem tarea) {
		super(tarea);
	}
	
	@Override
	public void start() {
		ToDoItem tarea = this.getTarea();
		tarea.changeState(new InProgress(tarea));
	}

	@Override
	public void togglePause() throws RuntimeException {
		throw new RuntimeException("La tarea no se encuentra en pause o in-progress");
	}

	@Override
	public Duration workedTime() {
		throw new RuntimeException("La tarea no se encuentra en pause, in-progress o finished");
	}

}
