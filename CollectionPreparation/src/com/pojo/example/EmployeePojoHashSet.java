package com.pojo.example;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeePojoHashSet {
	public static void main(String[]args) {
		System.out.println("using constructor");
		
		Employee emp=new Employee(1,"Susant",45);
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		
		
		System.out.println("Using for Setter & Getter");
		
		
		Employee emp1=new Employee();
		emp1.setId(15);
		emp1.setName("Dibya");
		emp1.setAge(22);
		
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getAge());
		
		Employee emp2=new Employee(16,"Pinku",35);
		
		
		System.out.println("Using Hash Map");
		HashSet<Employee> hm=new HashSet<Employee>();
		
		hm.add(emp);
		hm.add(emp1);
		hm.add(emp2);
		
		System.out.println("Using for loop");
		
		for(int i=0;i<hm.size();i++) {
			Employee empl=hm.add(i);
			
			System.out.println(empl.getId());
			System.out.println(empl.getName());
			System.out.println(empl.getAge());
			
		}
		System.out.println("Using each for loop");
		{
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		}
		System.out.println("Using Iterator");
		
		Iterator ir=hm.iterator();
		while(ir.hasNext()) {
			Object obj=ir.next();
			Employee empl2=(Employee)obj;
			
			System.out.println(empl2.getId());
			System.out.println(empl2.getName());
			System.out.println(emp2.getAge());
		}
	}

}
