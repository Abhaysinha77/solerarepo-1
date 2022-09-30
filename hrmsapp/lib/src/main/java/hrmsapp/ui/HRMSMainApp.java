package hrmsapp.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import hrmsapp.exceptions.EmployeeNotFoundException;
import hrmsapp.model.Address;
import hrmsapp.model.Employee;
import hrmsapp.service.EmployeeService;
import hrmsapp.service.EmployeeServiceImpl;

public class HRMSMainApp {

	public static void main(String[] args) {
		Address address = new Address();
		address.setId(1);
		address.setHouseNo(111);
		address.setCity("Bhavnagar");
		address.setCountry("India");
		address.setState("Gujarat");
		address.setStreet("Modi Gali");
		address.setZipcode(121111L);
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Mitul");
		emp.setSalary(150000.00);
		emp.setDateOfBirth(LocalDate.of(1999, 3, 1));
		emp.setAddress(address);
		
		Employee emp1 = new Employee();
		emp1.setId(2);
		emp1.setName("Hetal");
		emp1.setSalary(150555.00);
		emp1.setDateOfBirth(LocalDate.of(1999, 8, 15));
		emp1.setAddress(address);
		
		Address address1 = new Address();
		address1.setId(1);
		address1.setHouseNo(111);
		address1.setCity("Bhavnagar");
		address1.setCountry("India");
		address1.setState("Gujarat");
		address1.setStreet("Modi Gali");
		address1.setZipcode(121111L);
		
		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("Chiru");
		emp3.setSalary(175555.00);
		emp3.setDateOfBirth(LocalDate.of(1952, 1, 26));
		emp3.setAddress(address1);
		EmployeeService employeeService =  new EmployeeServiceImpl();
		List<Employee> listOfEmployees  = new ArrayList<Employee>();
		listOfEmployees.add(employeeService.addEmployee(emp));
		listOfEmployees.add(employeeService.addEmployee(emp1));
		listOfEmployees.add(employeeService.addEmployee(emp3));
		
		System.out.println(listOfEmployees);
		
		try {
			Employee e = employeeService.getEmployeeById(11);
			System.out.println(e);
		} catch (EmployeeNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
