package eygds.maven.demo.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTests {

	@Test
 	public void testAddNums() {
		Calc calc = new Calc();
		int expected = 10;
		int actual = calc.addNums(5, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void testSubNums() {
		Calc calc = new Calc();
		int expected = 5;
		int actual = calc.subNums(10, 5);
		assertEquals(expected, actual);
	}
}
