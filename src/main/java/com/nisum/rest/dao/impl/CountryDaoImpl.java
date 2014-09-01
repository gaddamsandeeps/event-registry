package com.nisum.rest.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.nisum.rest.Country;
import com.nisum.rest.dao.CountryDao;

public class CountryDaoImpl implements CountryDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String save() {

		return "Jersey + Spring example";

	}

	@Override
	public List<Country> read() {
		String sql = "SELECT * FROM countries";
		List<Country> countries = jdbcTemplate.query(sql,
				new CountryRowMapper());
		return countries;
	}

	@Override
	public List<Country> readByName(String name) {
		String sql = "SELECT * FROM countries WHERE country = ?";
		List<Country> countries = jdbcTemplate.query(sql,
				new Object[] { name }, new CountryRowMapper());
		return countries;
	}

	@Override
	public String save(String countryName, String population, String city) {
		String sql = "INSERT INTO countries "
				+ "(country, population, largestcity) VALUES (?, ?, ?)";

		int r = jdbcTemplate.update(sql, new Object[] { countryName,
				population, city });
		return String.valueOf(r);
	}

}