package com.sample.app.util;

import com.sample.app.Employee;

public class EmployeeUtil {

	public static String getEmployeeAsString(Employee emp) {
		if(emp == null) {
			return "none";
		}
		
		return emp.getId()+","+emp.getFirstName()+","+emp.getLastName();
	}
}
