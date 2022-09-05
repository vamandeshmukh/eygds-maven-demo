package eygds.maven.demo;

import java.util.Scanner;

import eygds.maven.demo.maths.Calc;

/**
 * 
 * @author Vaman Deshmukh
 * 
 *         Maven demo project for EYGDS trainees Aug 2022
 *         
 *         Run on CMD as :
 *         
 *         java -jar eygds-maven-demo-0.0.1-SNAPSHOT.jar
 */

public class App {

	public static void main(String[] args) {

		System.out.println("Start...");
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter num1");
		int num1 = sc.nextInt();
		System.out.println("Please enter num2");
		int num2 = sc.nextInt();

		Calc calc = new Calc();

		System.out.println(calc.addNums(num1, num2));
		System.out.println(calc.subNums(num1, num2));

		sc.close();
		System.out.println("End");

	}
}
