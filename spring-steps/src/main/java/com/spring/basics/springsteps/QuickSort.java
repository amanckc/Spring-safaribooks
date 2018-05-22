package com.spring.basics.springsteps;

public class QuickSort implements SortAlgorithm {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	public int[] sort(int num[])
	{
		int n=num.length;
		Quicksort(num, 0,n-1);//(num,0,n-1);
		return num;
	}
	
	public int partition(int arr[], int left, int right)
    {
	int i = left-1; 
        int pivot = arr[right]; 
        
        for (int j=left; j<right; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
 
        int temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
 
        return i+1;
    }
	public void Quicksort(int arr[],int left,int right)
	{
		if(left<right)
		{
			
			int part_index=partition(arr,left,right);
			Quicksort(arr,left,part_index-1);
			Quicksort(arr,part_index+1,right);
			
		}
	}
	
}
