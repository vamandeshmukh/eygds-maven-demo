package eygds.maven.demo.service;

import java.util.ArrayList;
import java.util.List;

import eygds.maven.demo.model.Employee;

public class EmployeeService {

	List<Employee> empList = new ArrayList<>();

	public EmployeeService() {
		super();
		if (empList.isEmpty()) {
			empList.add(new Employee(201, "Abc", 10000));
			empList.add(new Employee(202, "Def", 15000));
			empList.add(new Employee(203, "Ghi", 12000));
		}

	}

	public Employee addEmp(Employee employee) {
		if (empList.add(employee))
			return employee;
		throw new RuntimeException("Employee could not be added.");
	}

	public List<Employee> getAllEmps() {
		return empList;
	}

} 
