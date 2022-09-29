package hrmsapp.dao;

import hrmsapp.exceptions.EmployeeNotFoundException;
import hrmsapp.model.Employee;

public interface EmployeeDAO {
		
	//Create
	public Employee addEmployee(Employee employee);
	
	//Retrieve
	public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException;
	
	//Update
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;
	
	//Delete
	public String deleteEmployee(Integer id) throws EmployeeNotFoundException;

}
