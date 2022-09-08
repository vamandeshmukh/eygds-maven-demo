package eygds.maven.demo.logging;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogDemo {

	private static final Logger logger = LogManager.getLogger(LogDemo.class);

	public static void main(String[] args) {

		Calc calc = new Calc();

		Scanner sc = new Scanner(System.in);
		logger.info("Please enter num1");
		int num1 = sc.nextInt();

		logger.info("Please enter num2");
		int num2 = sc.nextInt();

		int num3 = calc.divNums(num1, num2);

		logger.info(num3);

	}

}
