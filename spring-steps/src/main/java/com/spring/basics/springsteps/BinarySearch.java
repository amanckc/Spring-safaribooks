package com.spring.basics.springsteps;

public class BinarySearch {

	private SortAlgorithm sortAlgorithm;
	
	
	
	public BinarySearch(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarysearch(int arr[],int element)
	{
		
		//BubbleSort bubble=new BubbleSort();
		int sort[]=sortAlgorithm.sort(arr);
		
		System.out.println(sortAlgorithm);
		return element;
		
	}
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
