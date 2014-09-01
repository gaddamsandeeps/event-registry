package com.nisum.rest.dao;

import java.util.List;

import com.nisum.rest.Country;
 
public interface CountryDao{
 
	String save();
	
	List<Country> read();

	List<Country> readByName(String name);

	String save(String countryName, String population, String city);

 
}