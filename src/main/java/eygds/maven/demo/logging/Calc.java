package eygds.maven.demo.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calc {

	private final Logger logger = LogManager.getLogger(this.getClass());

	public int divNums(int i, int j) {

		int k = 0;
		try {
			k = i / j;
		} catch (ArithmeticException e) {
			logger.warn("Do not divide by 0");
		}
		return k;
	}

}
