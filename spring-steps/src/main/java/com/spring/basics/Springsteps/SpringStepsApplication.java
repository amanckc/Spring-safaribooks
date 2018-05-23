package com.spring.basics.Springsteps;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.apache.commons.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;

import org.springframework.context.ApplicationContext;

import com.spring.basics.Springsteps.basic.BinarySearch;
import com.spring.basics.Springsteps.scope.PersonDAO;

import net.bytebuddy.asm.Advice.This;




@SpringBootApplication
public class SpringStepsApplication {

	
	private static Logger LOGGER=
			LoggerFactory.getLogger(SpringStepsApplication.class);
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringStepsApplication.class, args);
		
		BinarySearch binarySearch=
				applicationContext.getBean(BinarySearch.class);
		PersonDAO personDAO=applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDAO2=applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		
		
		
		
		LOGGER.info("{}",personDAO2);//default scope is singleton

		LOGGER.info("{}",personDAO2.getJdbcConnection());
		
//		BinarySearch binarySearch11=
//			applicationContext.getBean(BinarySearch.class);
//		System.out.println(binarySearch);System.out.println("eee");
//		System.out.println(binarySearch11);
//		
//		
//		//int answrer=binarySearch.binarysearch(arr, element)
//		int answer=
//				binarySearch.binarysearch(new int[] {11,3,2,56,6,44,67}, 56);
//		System.out.println(answer);

	}

}
