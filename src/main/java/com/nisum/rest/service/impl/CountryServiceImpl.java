package com.nisum.rest.service.impl;

import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.nisum.rest.Country;
import com.nisum.rest.dao.CountryDao;
import com.nisum.rest.service.CountryService;

public class CountryServiceImpl implements CountryService {

	@Autowired
	CountryDao countryDao;

	@SuppressWarnings("unchecked")
	public String read() {
		List<Country> countries = countryDao.read();

		JSONArray jsonArray = new JSONArray();
		for (Iterator<Country> iterator = countries.iterator(); iterator
				.hasNext();) {
			Country country = (Country) iterator.next();
			JSONObject json = new JSONObject();
			json.put("countryName", country.getCountryName());
			json.put("population", country.getPopulation());
			json.put("city", country.getLargestCity());
			jsonArray.add(json);
		}

		return jsonArray.toJSONString();

	}

	public String save() {
		return countryDao.save();
	}

	@Override
	public String readByName(String name) {
		List<Country> countries = countryDao.readByName(name);

		JSONArray jsonArray = new JSONArray();
		for (Iterator<Country> iterator = countries.iterator(); iterator
				.hasNext();) {
			Country country = (Country) iterator.next();
			JSONObject json = new JSONObject();
			json.put("countryName", country.getCountryName());
			json.put("population", country.getPopulation());
			json.put("city", country.getLargestCity());
			jsonArray.add(json);
		}

		return jsonArray.toJSONString();

	}

	@Override
	public String save(String countryName, String population, String city) {
		return countryDao.save(countryName, population, city);
	}

}
