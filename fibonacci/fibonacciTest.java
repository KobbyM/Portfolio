package com.qa.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class fibonacciTest {
	
	@Test
	public void recursionTest() {
		Runner run = new Runner();
		assertEquals(102334155, run.fibonacci(40));
	}
	
	@Test
	public void iterationTest() {
		Runner run = new Runner();
		assertEquals(102334155, run.fibonacciAlt(40));
	}
}
