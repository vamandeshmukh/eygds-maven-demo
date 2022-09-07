package eygds.maven.demo;

import java.util.Scanner;

public class LoggingDemo {

	public static void main(String[] args) {

//		Login

//			Logging 
//			Log
//			Logs
//			Logfile 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name:");

		String name = sc.next();
		System.out.println("Welcome " + name + "!");

		sc.close();

	}

}
