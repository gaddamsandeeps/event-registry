package com.nisum.rest.service;


public interface CountryService {
	
	String read();
	
	String save(String countryName, String population, String city);
	
	String readByName(String name);

}
