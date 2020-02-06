package com.employee;

import java.util.Comparator;

public class SortingByName implements Comparator<EmployeeModel>{
	
	public int compare(EmployeeModel e1,EmployeeModel e2) {
		
		return e1.getName().compareTo(e2.getName());
	}

}
