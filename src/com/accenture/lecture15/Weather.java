package com.accenture.lecture15;

public class Weather {
	private final String country; 
	private  int[] daysWeather; 
	
	public Weather(String country , int[] daysWeater) {
		this.country = country;
		this.daysWeather = daysWeater;
	}

	public String getCountry() {
		return country;
	}

	public int[] getDaysWeather() {
		return daysWeather;
	}
}
