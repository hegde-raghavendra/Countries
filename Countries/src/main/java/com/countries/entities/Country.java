package com.countries.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Country {
	
	@Id
	@GeneratedValue
	private Integer Id;
	
	private String name;
	private String capital;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public Country(String name, String capital) {
		super();
		this.name = name;
		this.capital = capital;
	}
	public Country() {
		super();
	}
	@Override
	public String toString() {
		return "Country [Id=" + Id + ", name=" + name + ", capital=" + capital + "]";
	}
	
	
	

	
}
