package com.spring.basics.Springsteps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import ch.qos.logback.classic.Logger;
import net.bytebuddy.asm.Advice.This;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//request new Bean
public class BinarySearch {
	//private Logger logger=LoggerFactory.getLogger(this.getClass());
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;

	public int binarysearch(int arr[],int element)
	{
		
		//BubbleSort bubble=new BubbleSort();
		int sort[]=sortAlgorithm.sort(arr);
		
		System.out.println(sortAlgorithm);
		System.out.println(sort);
		return element;
		
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	
	@PreDestroy
	public void preDestroy()
	{
		logger.info("preDestroy");
	}

}
