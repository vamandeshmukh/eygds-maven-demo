package eygds.maven.demo.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

// test suites    
public class CalcTests {

	@Test // positive test case
	public void testAddNums() {
		Calc calc = new Calc();
		assertEquals(10, calc.addNums(5, 5));
	}

	@Test // negative test case
	public void testAddNums2() {
		Calc calc = new Calc();
		int unexpected = 11;
		int actual = calc.addNums(5, 5);
		assertNotEquals(unexpected, actual);
	}

	@Test
	public void testSubNums() {
		Calc calc = new Calc();
		int expected = 5;
		int actual = calc.subNums(10, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void testSubNums2() {
		Calc calc = new Calc();
		int unexpected = 66;
		int actual = calc.subNums(10, 5);
		assertNotEquals(unexpected, actual);
	}
}
