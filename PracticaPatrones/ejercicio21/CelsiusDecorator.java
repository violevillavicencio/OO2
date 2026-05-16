package io.github.unlp_oo.archetype;

import java.util.List;

public class CelsiusDecorator extends WeatherDecorator {

	public CelsiusDecorator(WeatherData component) {
		super(component);
	}
	
	@Override
	public double getTemperatura() {
		return (component.getTemperatura() - 32)
		        / 1.8;
	}
	
	@Override
	public List<Double> getTemperaturas() {
		return component.getTemperaturas()
		        .stream()
		        .map(t -> (t - 32) / 1.8)
		        .toList();
	}
	
	@Override
	public String displayData() {
		return "Temperatura C: "
		        + this.getTemperatura()
		        + " Presión atmosf: "
		        + this.getPresion()
		        + " Radiación solar: "
		        + this.getRadiacionSolar();
	}
}
