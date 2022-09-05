package eygds.maven.demo;

import com.google.gson.Gson;

import eygds.maven.demo.model.Employee;

public class GsonDemo {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Sonu", 90000);

		System.out.println(emp.toString());

		Gson gson = new Gson();

		String empJsonData = gson.toJson(emp);

		System.out.println(empJsonData);

		Employee empData = gson.fromJson(empJsonData, Employee.class);

		System.out.println(empData.toString());

	}

}
