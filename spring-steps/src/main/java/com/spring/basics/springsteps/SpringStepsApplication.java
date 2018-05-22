package com.spring.basics.springsteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStepsApplication {

	public static void main(String[] args) {
		
		BinarySearch binary=new BinarySearch(new BubbleSort());
		System.out.println(binary.binarysearch(new int[] {11, 22,3,4,51,3},3));
		
		SpringApplication.run(SpringStepsApplication.class, args);
	}
}
