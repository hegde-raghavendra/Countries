package com.countries;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.countries.repositories")
public class CountryConfiguration {

}
