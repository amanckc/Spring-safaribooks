package com.spring.basics.Springsteps;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.basics.componentscan.ComponentDAO;
import net.bytebuddy.*;
import net.bytebuddy.asm.Advice.This;


@SpringBootApplication
@ComponentScan("com.spring.basics.componentscan")
public class SpringStepsComponentScanApplication {

	
	private static Logger LOGGER=
			LoggerFactory.getLogger(SpringStepsComponentScanApplication.class);
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringStepsComponentScanApplication.class, args);
		
		
		ComponentDAO componentDAO=applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}",componentDAO);


	}

} 
