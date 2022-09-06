package eygds.maven.demo.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// test suites    
public class CalcTests {

	private static Calc calc;

	@BeforeAll
	public static void init() {
		System.out.println("code to run before all the test cases");
		calc = new Calc();
	}

	@AfterAll
	public static void destroy() { // compare with finally block in exception handling
		System.out.println("code to run after all the test cases");
		calc = null;
	}

	@BeforeEach
	public void runBeforeEachTestCase() {
		System.out.println("code to run before each test case");
	}

	@AfterEach
	public void runAfterEachTestCase() {
		System.out.println("code to run after each test case");
	}

	@Test // positive test case
	public void testAddNums() {
		System.out.println("testAddNums");
		calc = new Calc();
		assertEquals(10, calc.addNums(5, 5));
	}

	@Test // negative test case
	public void testAddNums2() {
		System.out.println("testAddNum2");
		calc = new Calc();
		int unexpected = 11;
		int actual = calc.addNums(5, 5);
		assertNotEquals(unexpected, actual);
	}

	@Test
	public void testSubNums() {
		System.out.println("testSubNums");
		calc = new Calc();
		int expected = 5;
		int actual = calc.subNums(10, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void testSubNums2() {
		System.out.println("testSubNum2");
		calc = new Calc();
		int unexpected = 66;
		int actual = calc.subNums(10, 5);
		assertNotEquals(unexpected, actual);
	}
}
