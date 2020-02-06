package com.employee;

import java.util.Comparator;

public class SortingById implements Comparator<EmployeeModel> {
	
	public int compare(EmployeeModel e1,EmployeeModel e2) {
		if(e1.getId()==e2.getId())
			return 0;
		else if(e1.getId()>e2.getId())
			return 1;
		else
			return -1;
	}

}
