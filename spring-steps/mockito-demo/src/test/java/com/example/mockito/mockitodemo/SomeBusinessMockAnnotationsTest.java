package com.example.mockito.mockitodemo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotationsTest {

	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessimpl businessimpl;//dataServiceMock injected into it

	@Test
	public void testFindGreatestData() {
		//fail("Not yet implemented");
		//DataService dataServiceMock = mock(DataService.class);//(DataService.class)
		//dataServiceMock.retriveAllData()
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {23,4,1,42,2});
		
		//SomeBusinessimpl businessimpl=new SomeBusinessimpl(dataServiceMock);
		int result = businessimpl.findGreatestData();
		assertEquals(42,result);
	}
	
	
	@Test
	public void testFindGreatestDataforNull() {
		//fail("Not yet implemented");
		//DataService dataServiceMock = mock(DataService.class);//(DataService.class)
		//dataServiceMock.retriveAllData()
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
		
		//SomeBusinessimpl businessimpl=new SomeBusinessimpl(dataServiceMock);
		int result = businessimpl.findGreatestData();
		assertEquals(Integer.MIN_VALUE,result);
		assertNotNull(result);
	}

}



	
