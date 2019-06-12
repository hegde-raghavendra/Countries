package com.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Integer>{
	
	

}
