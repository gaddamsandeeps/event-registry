package com.nisum.rest.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nisum.rest.Country;

public class CountryRowMapper implements RowMapper<Country> {
	public Country mapRow(ResultSet rs, int rowNum) throws SQLException {
		Country country = new Country();
		country.setCountryName(rs.getString("country"));
		country.setLargestCity(rs.getString("largestcity"));
		country.setPopulation(rs.getLong("population"));
		return country;
	}
}
