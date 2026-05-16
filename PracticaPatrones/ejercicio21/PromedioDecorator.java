package io.github.unlp_oo.archetype;

public class PromedioDecorator extends WeatherDecorator {

	public PromedioDecorator(WeatherData component) {
		super(component);
	}
	
	@Override
	public String displayData() {
		return component.displayData()
	        + " Promedio: "
	        + this.calcularPromedio();
	}
	
	private double calcularPromedio() {
		return component.getTemperaturas()
		        .stream()
		        .mapToDouble(t -> t)
		        .average()
		        .orElse(0);
	}
}
