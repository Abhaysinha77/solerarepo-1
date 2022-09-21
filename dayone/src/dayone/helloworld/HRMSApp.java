package dayone.helloworld;

import java.time.LocalDate;

public class HRMSApp {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Address address = new Address();
		
		address.setAddressId(1);
		address.setCity("Bengaluru");
		address.setCountry("India");
		address.setState("Karnatka");
		address.setStreet("Bhattarhalli");
		
		employee.setEmpId(1);
		employee.setName("Vishnu");
		employee.setSalary(1555555.50);
		employee.setDateOfBirth(LocalDate.now());
		employee.setAddress(address);
		
		
		System.out.println(employee);
		
		Employee emp = new Employee(2,"Saket",1434534.56,LocalDate.now(),address);

		System.out.println(emp);
		System.out.println(emp.getName());
	}

}
