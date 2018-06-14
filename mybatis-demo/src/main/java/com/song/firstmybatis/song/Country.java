package com.song.firstmybatis.song;

import java.util.List;

import com.song.firstmybatis.City;

public class Country {

	private String name;
	private String code;
	private List<City> cities;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<City> getCities() {
		return cities;
	}
	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
	
}
