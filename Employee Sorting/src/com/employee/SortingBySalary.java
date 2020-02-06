package com.employee;

import java.util.Comparator;

public class SortingBySalary implements Comparator<EmployeeModel>
{	
	public int compare(EmployeeModel e1,EmployeeModel e2) {
		if(e1.getSalary()==e2.getSalary())
			return 0;
		else if(e1.getSalary()>e2.getSalary())
			return 1;
		else
			return -1;
	}
}
