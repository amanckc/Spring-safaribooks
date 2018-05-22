package com.spring.basics.Springsteps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	@Autowired
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
