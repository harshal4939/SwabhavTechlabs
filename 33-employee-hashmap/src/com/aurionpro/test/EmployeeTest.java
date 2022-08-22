package com.aurionpro.test;

import java.util.HashMap;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employees[]= {
				new Employee(1,"Harshal",100000),
				new	Employee(2,"Ashish",100000),
				new Employee(3,"xyz",50000)
		};
		
		HashMap<Integer,String> emp = new HashMap<Integer,String>();
		for(Employee e : employees) {
			emp.put(e.getId(),e.getName());
		}
		
		System.out.println(emp);
	}

}
