package com.pojo.example;

import java.util.HashMap;

public class EmployeePojoHashMap {
	public static void main(String[]args) {
		System.out.println("Using for constructor");
		
		Employee emp=new Employee(8,"Sanu Sir",45);
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		
		
		System.out.println("Using for Setter & Getter");
		Employee emp1=new Employee();
		emp1.setId(77);
		emp1.setName("Dibya");
		emp1.setAge(55);
		
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getAge());
		
	Employee emp2=new Employee(22,"Gutu",55);
	HashMap<Integer,Employee> hm=new HashMap<Integer,Employee>();
	
	
	hm.put(1, emp);
	hm.put(2, emp1);
	hm.put(3, emp2);
	
	
	
	
	}

}
