package eygds.maven.demo;

import eygds.maven.demo.maths.Calc;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		Calc calc = new Calc();

		System.out.println(calc.addNums(10, 20));
		System.out.println(calc.subNums(10, 5));

	}
}

