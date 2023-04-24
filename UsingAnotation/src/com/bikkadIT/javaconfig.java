package com.bikkadIT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.bikkadIT","in.bikkadIT"} )
public class javaconfig {

	@Bean
	public Employee getE() {
		Employee e=new Employee();
		return e;
	}
}
