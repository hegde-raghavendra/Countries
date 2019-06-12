package com.countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.countries.entities.Country;
import com.countries.repositories.CountryRepository;

@SpringBootApplication
public class CountriesApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CountriesApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		countryRepository.save(new Country("Earth", "World"));
		countryRepository.save(new Country("USA", "Washington,DC"));
		countryRepository.save(new Country("India", "New Delhi"));
		countryRepository.save(new Country("China", "Peking"));
		countryRepository.save(new Country("Genrmany", "Berlin"));
		countryRepository.save(new Country("Russia", "Moscow"));
		countryRepository.save(new Country("Canada", "Ottawa"));
		countryRepository.save(new Country("Kenya", "Nairobi"));
		countryRepository.save(new Country("Lebanon", "Beirut"));
		countryRepository.save(new Country("Egypt", "Kairo"));


		
	}



}
