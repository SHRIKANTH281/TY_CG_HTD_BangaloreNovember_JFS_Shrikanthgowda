package com.capgemini.junit_five.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.junit_five.junit.Calculator;

class TestCalculator {
	Calculator c=null;
	void createObject() {
		c=new Calculator();
	}
	
	@Test
	public void test() {
		c= new Calculator();
		int i=c.add(10	, 5);
		assertEquals(i, 15);
	}
	@Test
	void testAddForNegative() {
		c= new Calculator();
		int i=c.add(-3, 8);
		assertEquals(5,i);
	}

	@Test
	void Tsetmultiply() {
		c=new Calculator();
		int i=c.mul(3, 6);
		assertEquals(18,i);
	}
	@Test
	void Testdivision() {
		c= new Calculator();
		assertThrows(ArithmeticException.class,
				()->{
					c.div(10, 0);
				});
	}

	@Test
	void testFindLength() {
		c= new Calculator();
		int res=c.findLength("shrikanth");
		assertEquals(9,res);
	}

	@Test
	void testFindLengthNull() {
		c= new Calculator();

		assertThrows(NullPointerException.class,
				()->{
					c.findLength(null);
				}
				);
	}
}