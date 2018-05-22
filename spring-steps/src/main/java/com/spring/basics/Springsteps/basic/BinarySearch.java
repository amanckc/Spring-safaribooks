package com.spring.basics.Springsteps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearch {
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
	
//	public BinarySearch(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}



	public int binarysearch(int arr[],int element)
	{
		
		//BubbleSort bubble=new BubbleSort();
		int sort[]=sortAlgorithm.sort(arr);
		
		System.out.println(sortAlgorithm);
		System.out.println(sort);
		return element;
		
	}


	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
