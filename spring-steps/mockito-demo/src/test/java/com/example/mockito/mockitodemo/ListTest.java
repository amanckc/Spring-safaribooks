package com.example.mockito.mockitodemo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.awt.Dimension;
import java.awt.List;

import org.junit.Before;
import org.junit.Test;

public class ListTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		List listMock=mock(List.class);
		
//		when(listMock.size()).thenReturn(10);
//		assertEqulas(10,listMock.size());
	}

	
	
	
	@Test
	public void testMiultiple() {
		//fail("Not yet implemented");
		
		List listMock=mock(List.class);
		when(listMock.getSize()).thenReturn(null);
//		when(listMock.size()).thenReturn(10);
		assertEquals(10,listMock.getSize());
	}
	
	
	
	@Test
	public void testGet() {
		//fail("Not yet implemented");
		
		List listMock=mock(List.class);
		
//		when(listMock.size()).thenReturn(10);
		assertEquals(10,listMock.getSize());
	}
}
