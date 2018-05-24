package com.spring.basics.Springsteps;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.basics.Springsteps.cdi.SomeCdiBusiness;
import com.spring.basics.componentscan.ComponentDAO;
import net.bytebuddy.*;
import net.bytebuddy.asm.Advice.This;


@SpringBootApplication
@ComponentScan("com.spring.basics.componentscan")
public class SpringStepsCdiApplication {

	
	private static Logger LOGGER=
			LoggerFactory.getLogger(SpringStepsCdiApplication.class);
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringStepsCdiApplication.class, args);
		
		
		SomeCdiBusiness cdiBusiness=applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{}",cdiBusiness);


	}

} 
 