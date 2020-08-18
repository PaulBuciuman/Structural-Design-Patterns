package adapter;

import java.util.*;

public class EmployeeClient {
	public List<Employee> getEmployeeList(){
		
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee employeeFromDB = new EmployeeDB("123","paul","buciuman","email.email@email");
		employees.add(employeeFromDB);
		
		EmployeeLdap empFromLdap = new EmployeeLdap("321","paul","daniel","asdfa@asdf.com");
		
		employees.add(new EmployeeAdapterLdap(empFromLdap));
		
		return employees;
	}

}
