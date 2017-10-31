package com.patter.observer;

public class RunMain {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(10.0f, 20.0f, 30.0f);
		weatherData.setMeasurements(40.0f, 50.0f, 60.0f);
		weatherData.setMeasurements(70.0f, 80.0f, 90.0f);
	}
}
