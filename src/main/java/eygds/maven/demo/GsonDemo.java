package eygds.maven.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import eygds.maven.demo.model.Employee;

public class GsonDemo {

	public static void main(String[] args) throws IOException {

		Employee emp = new Employee(101, "Sonu", 90000);

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Sonu", 90000));
		empList.add(new Employee(102, "Monu", 95000));
		empList.add(new Employee(103, "Tonu", 80000));

		Gson gson = new Gson();

		String empJson = gson.toJson(empList);

		String file = "emp.json";

//		FileWriter writer = new FileWriter(file);
//		writer.write(empJson);
//		writer.close();

		FileReader reader = new FileReader(file);
		
		String empGsonDataFromFile = "";
		





		reader.close();

		System.out.println("end");

//		System.out.println(emp.toString());
//
//		Gson gson = new Gson();
//
////		gson.
//
//		String empJsonData = gson.toJson(emp);
//
//		String file = "emp.json";
//
//		FileWriter writer = new FileWriter(file);
//
//		writer.write(empJsonData);
//
//		// write empJsonData data to a file
//
//		writer.close();
//
//		System.out.println(empJsonData);
//
//		Employee empData = gson.fromJson(empJsonData, Employee.class);
//
//		System.out.println(empData.toString());

	}

}
