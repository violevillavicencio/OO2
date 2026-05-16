package io.github.unlp_oo.archetype;

public class MinMaxDecorator extends WeatherDecorator {
	
	public MinMaxDecorator(WeatherData component) {
		super(component);
	}
	
	@Override
	public String displayData() {
		return component.displayData()
		        + " Minimo: "
		        + this.minimo()
		        + " Maximo: "
		        + this.maximo();
	}
	
	private double minimo() {
		return component.getTemperaturas()
		        .stream()
		        .mapToDouble(t -> t)
		        .min()
		        .orElse(0);
	}
	
	private double maximo() {
		return component.getTemperaturas()
		        .stream()
		        .mapToDouble(t -> t)
		        .max()
		        .orElse(0);
		}
}
