package com.patter.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气主题
 * @author Administrator
 *
 */
public class WeatherData implements Subject{

	private List<Observer> observers;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		if(observer == null){
			//注册的观察者为空
		}
		if(!observers.contains(observer)){
			observers.add(observer);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		if(observer == null){
			//移除的观察者为空
		}
		if(observers.contains(observer)){
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temp, humidity, pressure);
		}
	}

	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
