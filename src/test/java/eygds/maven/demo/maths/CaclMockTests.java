package eygds.maven.demo.maths;

import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

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

}
