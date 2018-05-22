package com.spring.basics.Springsteps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("bubble")
public class BubbleSort implements SortAlgorithm{

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	
	public int[] sort(int arr[])
	{
		 boolean isSwapped=false;
			for (int i=0;i<arr.length-1 ;i++ ) {
				

				for (int j=0; j<arr.length-1-i;j++ ) {
					if(arr[j+1]<arr[j])
					{	isSwapped=true;
						int temp=arr[j+1];
						arr[j+1]=arr[j];
						arr[j]=temp;
					}
				}
				
				if(isSwapped==false)
					break;
			}
			
			return arr;
		
	}

}
