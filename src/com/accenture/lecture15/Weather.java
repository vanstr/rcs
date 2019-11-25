package com.accenture.lecture15;

import java.util.Arrays;

public class Weather {

	private final String country;
	private int[] daysWeather;
	private String[] weekWeather = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

	public Weather(String country, int[] daysWeather) {
		super();
		this.country = country;
		this.daysWeather = daysWeather;
	}

	public int[] getDaysWeather() {
		return daysWeather;
	}

	public String getCountry() {
		return country;
	}

	public String toString() {
		return "Weather in " + getCountry() + " for next days " + "'" + Arrays.toString(daysWeather) + "'";
	}

	public double getWeekAverage() {
		double sum = 0;
		for (int i = 0; i < daysWeather.length; i++) {
			sum += daysWeather[i];
		}
		double average = sum / daysWeather.length;
		return average;
	}

	public String getHottestDay2() {
		int hottestIndex = getHottestTemperatureIndex();
		return weekWeather[hottestIndex];
	}

	public int getHottestTemperature() {
		int hottestIndex = getHottestTemperatureIndex();
		return daysWeather[hottestIndex];
	}

	private int getHottestTemperatureIndex() {
		int maxWeather = Integer.MIN_VALUE;
		int maxIndex = Integer.MIN_VALUE;
		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather[i] > maxWeather) {
				maxWeather = daysWeather[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public String getHottestDay() {
		int hottestIndex = getHottestTemperatureIndex();
		switch (hottestIndex) {
		case 0:
			return "Monday";
		case 1:
			return "Tuesday";
		case 2:
			return "Wednsday";
		case 3:
			return "Thursday";
		case 4:
			return "Friday";
		case 5:
			return "Saturday";
		case 6:
			return "Sunday";
		default:
			return "Unknown";
		}
	}

	private int getColdestTemperatureIndex() {
		int minWeather = Integer.MAX_VALUE;
		int minIndex = Integer.MAX_VALUE;
		for (int i = 0; i < daysWeather.length; i++) {
			if (daysWeather[i] < minWeather) {
				minWeather = daysWeather[i];
				minIndex = i;
			}
		}

		return minIndex;
	}

	public int getColdestTemperature() {
		int coldestIndex = getColdestTemperatureIndex();
		return daysWeather[coldestIndex];

	}

	public String getColdestDay() {
		int coldestIndex = getColdestTemperatureIndex();
		return weekWeather[coldestIndex];
	}

	public void printAdvancedInformation() {
		String hottestDay = getHottestDay2();
		String coldestDay = getColdestDay();
		int coldestTemp = getColdestTemperature();
		int hottestTemp = getHottestTemperature();
		System.out.println(
				"In " + country + " during next 7 days will be folowing weather" + Arrays.toString(daysWeather));
		System.out.println("The highest temperature will be on " + hottestDay + " " + hottestTemp + " degree.");
		System.out.println("The lowest temperature will be on " + coldestDay + " " + coldestTemp + " degree.");
	}

	public void applyWarmCycloneEffect() {

		for (int i = 0; i < daysWeather.length; i++) {
			daysWeather[i]++;
		}
		System.out.println("Weather forecast in " + country + " for next days " + Arrays.toString(daysWeather));
	}

}