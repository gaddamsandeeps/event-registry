package com.nisum.rest;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Country implements Serializable{

	private String countryName;
	private Long population;
	private String largestCity;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public String getLargestCity() {
		return largestCity;
	}

	public void setLargestCity(String largestCity) {
		this.largestCity = largestCity;
	}

}
