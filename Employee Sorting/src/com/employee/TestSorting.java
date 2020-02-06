package com.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestSorting {

	public static void main(String[] args) {
		
	EmployeeModel e1 = new EmployeeModel(121,"John",2000,24);
	EmployeeModel e2 = new EmployeeModel(101,"Peter",1300,22);
	EmployeeModel e3 = new EmployeeModel(187,"Lucy",2400,27);
	EmployeeModel e4 = new EmployeeModel(152,"Clark",3600,31);
	EmployeeModel e5 = new EmployeeModel(136,"Shanell",1100,21);
	
	
	List<EmployeeModel> employees = new ArrayList<EmployeeModel>();
	employees.add(e1);
	employees.add(e2);
	employees.add(e3);
	employees.add(e4);
	employees.add(e5);
	
	System.out.println("Sorted Employee List by Name:");
	Collections.sort(employees, new SortingByName());
	System.out.println(employees);
		
	while(true) {
	System.out.println("Sort By => 1.ID 2.Salary 3.Age 4.Quit\nEnter your choice:");
	
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	
	switch(choice) {
	case 1:	System.out.println("Sorted Employee List by Id:");
			Collections.sort(employees, new SortingById());
			System.out.println(employees);
			break;
	case 2:	System.out.println("Sorted Employee List by Salary:");
			Collections.sort(employees, new SortingBySalary());
			System.out.println(employees);
			break;
	case 3:	System.out.println("Sorted Employee List by Age:");
			Collections.sort(employees, new SortingByAge());
			System.out.println(employees);
			break;	
	case 4:	
			System.exit(0);
	default:System.out.println("Enter valid choice");
			}
		}
	}
	

}
