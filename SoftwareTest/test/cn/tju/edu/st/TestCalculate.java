package cn.tju.edu.st;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalculate {
	
	Calculate cal;
	
	@Before
	public void setUp(){
		cal = new Calculate();
	}
	
	@Test
	public void testAdd(){

		assertEquals(1,2);
	}
	
	@Test
	public void testSubstract(){

		assertEquals(1,2);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivide(){

		assertEquals(1, cal.Divide(10, 0));
	}
	
	@Test
	public void testMult(){

		assertEquals(1,2);
	}
	
	@Test(timeout=300)
	public void timeout(){
		
		
	}
}
