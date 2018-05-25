package com.example.mockito.mockitodemo;

public class SomeBusinessimpl {
	private DataService dataservice;
	//constructor
	public SomeBusinessimpl(DataService dataservice) {
		super();
		this.dataservice = dataservice;
	}

	
	
	int findGreatestData() {
		int [] data=dataservice.retriveAllData();
		
		int max=Integer.MIN_VALUE;
		
		for(int val:data)
		{
			if(val>max)
			{
				max=val;
				
			}
		}
		return max;
		
	}
	
	
}


