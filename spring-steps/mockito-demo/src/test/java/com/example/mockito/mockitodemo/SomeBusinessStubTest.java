package com.example.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SomeBusinessStubTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testFindGreatestData() {
		//fail("Not yet implemented");
		
		SomeBusinessimpl businessimpl=new SomeBusinessimpl(new DataServiceStub());
		int result = businessimpl.findGreatestData();
		assertEquals(42,result);
	}

}


class DataServiceStub implements DataService{

	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[]  {23,4,1,42,2};
	}
	
}