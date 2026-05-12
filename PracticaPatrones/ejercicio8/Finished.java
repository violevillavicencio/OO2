package io.github.unlp_oo.archetype;

import java.time.Duration;

public class Finished extends State{

	public Finished(ToDoItem tarea) {
		super(tarea);
		this.getTarea().setEndDate();
	}
	
	@Override
	public void togglePause() throws RuntimeException {
		throw new RuntimeException("La tarea no se encuentra en pause o in-progress");
	}
	
	@Override
	public Duration workedTime() {
		return Duration.between(this.getTarea().getStartDate(), this.getTarea().getEndDate());
	}

	@Override
	public void addComment(String comment) {}

}
