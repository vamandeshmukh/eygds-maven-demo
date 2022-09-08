package eygds.maven.demo.maths;

import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

public class CaclMockTests {

	@Test
	public void testPrintNums() {

		System.out.println("testPrintNums");
		Calc calc = mock(Calc.class);
		doAnswer((abc) -> {
			return null;
		}).when(calc).printNums(2, 2);
	}

	@Test
	public void testPrintNums2() {
		System.out.println("testPrintNums2");
		Calc calc = mock(Calc.class);
		calc.printNums(2, 2);
		doNothing().when(calc).printNums(2, 2);
		verify(calc).printNums(2, 2);
	}

//	@Test
//	public void testPrintNums3() {
//
//		System.out.println("testPrintNums3");
//
//	}

}
