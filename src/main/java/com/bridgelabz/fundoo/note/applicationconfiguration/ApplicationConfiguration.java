package com.bridgelabz.fundoo.note.applicationconfiguration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

	@Bean
	public ModelMapper getMapper()
	{
		return new ModelMapper();
	}
	
}
