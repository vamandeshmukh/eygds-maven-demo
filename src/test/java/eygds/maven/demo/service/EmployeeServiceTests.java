package eygds.maven.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import eygds.maven.demo.model.Employee;

public class EmployeeServiceTests {

	@Test
	public void addEmployeeTest() {
		Employee empToAdd = new Employee(101, "Sonu", 90000);
		EmployeeService service = new EmployeeService();
		Employee addedEmp = service.addEmp(empToAdd);
		assertEquals(empToAdd, addedEmp);
	}

	@Disabled
	@Test
	public void addEmployeeMockTest() {
		EmployeeService mockService = Mockito.mock(EmployeeService.class);
		Employee realEmpObj = new Employee(102, "Monu", 95000);
		Mockito.when(mockService.addEmp(realEmpObj)).thenReturn(realEmpObj);
		assertEquals(102, mockService.addEmp(new Employee(102, "Monu", 95000)).getEmployeeId());
	}

	@Test
	public void getAllEmpsMockTest() {
		EmployeeService mockService = Mockito.mock(EmployeeService.class);
		List<Employee> empList = new ArrayList<>();
		empList.add(null);
		empList.add(null);
		empList.add(null);
		Mockito.when(mockService.getAllEmps()).thenReturn(empList);
		assertEquals(mockService.getAllEmps().size(), 3);

	}

}
