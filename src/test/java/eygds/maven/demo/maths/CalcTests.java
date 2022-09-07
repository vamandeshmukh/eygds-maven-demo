package eygds.maven.demo.maths;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

// test suites    
public class CalcTests {

	private static Calc calc;

	@BeforeAll
	public static void init() {
//		System.out.println("code to run before all the test cases");
		calc = new Calc();
	}

	@AfterAll
	public static void destroy() { // compare with finally block in exception handling
//		System.out.println("code to run after all the test cases");
		calc = null;
	}

	@BeforeEach
	public void runBeforeEachTestCase() {
//		System.out.println("code to run before each test case");
	}

	@AfterEach
	public void runAfterEachTestCase() {
//		System.out.println("code to run after each test case");
	}

	@ParameterizedTest
	@ValueSource(ints = { 5, 8, 10, 2, 4, 10, 15 })
	public void testAddNums(int num) {
//		System.out.println("testAddNums " + num);
		assertEquals(num + num, calc.addNums(num, num));
	}

	@Test // negative test case
	public void testAddNums2() {
//		System.out.println("testAddNum2");
		int unexpected = 11;
		int actual = calc.addNums(5, 5);
		assertNotEquals(unexpected, actual);
	}

	@Disabled
	@Test
	public void testSubNums() {
//		System.out.println("testSubNums");
		int expected = 5;
		int actual = calc.subNums(10, 5);
		assertEquals(expected, actual);
	}

	@Test
	public void testSubNums2() {
//		System.out.println("testSubNum2");
		int unexpected = 66;
		int actual = calc.subNums(10, 5);
		assertNotEquals(unexpected, actual);
	}

	@Test
	public void testGetDataFromDb() {
		assertTimeout(Duration.ofMillis(400), 
				() -> calc.getDataFromDb(2, 3));
	}

	@Test
	public void testCheckPositive() {
		assertThrows(RuntimeException.class, () -> {
			calc.checkPositive(-1);
		});
	}

	@Test
	public void testCheckPositive2() {
		assertDoesNotThrow(() -> {
			calc.checkPositive(1);
		});

	}

	@Test
	public void testPrintNums() {
		System.out.println("testPrintNums");
		// your code to use mockito 
	}

}
