package com.capg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest 
{
	@Test
	public void testSum()
	{
		App obj = new App();
		
		int actualResult = obj.sum(3, 4);
		int expectedResult = 7;
		
		assertEquals(expectedResult, actualResult);
	}
}
