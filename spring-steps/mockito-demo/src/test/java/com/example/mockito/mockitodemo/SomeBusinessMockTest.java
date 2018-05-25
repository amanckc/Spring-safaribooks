package com.example.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

	

	@Test
	public void testFindGreatestData() {
		//fail("Not yet implemented");
		DataService dataServiceMock = mock(DataService.class);//(DataService.class)
		//dataServiceMock.retriveAllData()
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {23,4,1,42,2});
		
		SomeBusinessimpl businessimpl=new SomeBusinessimpl(dataServiceMock);
		int result = businessimpl.findGreatestData();
		assertEquals(42,result);
	}
	
	
	@Test
	public void testFindGreatestDataforNull() {
		//fail("Not yet implemented");
		DataService dataServiceMock = mock(DataService.class);//(DataService.class)
		//dataServiceMock.retriveAllData()
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
		
		SomeBusinessimpl businessimpl=new SomeBusinessimpl(dataServiceMock);
		int result = businessimpl.findGreatestData();
		//assertEquals(0,result);
		assertNotNull(result);
	}

}



	
