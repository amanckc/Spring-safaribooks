package com.spring.basics.Springsteps;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

import org.springframework.context.ApplicationContext;

import com.spring.basics.Springsteps.basic.BinarySearch;




@SpringBootApplication
public class SpringStepsApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringStepsApplication.class, args);
		
		BinarySearch binarySearch=
				applicationContext.getBean(BinarySearch.class);
		BinarySearch binarySearch11=
			applicationContext.getBean(BinarySearch.class);
		
		
		
		//int answrer=binarySearch.binarysearch(arr, element)
		int answer=
				binarySearch.binarysearch(new int[] {11,3,2,56,6,44,67}, 56);
		System.out.println(answer);

	}

}
