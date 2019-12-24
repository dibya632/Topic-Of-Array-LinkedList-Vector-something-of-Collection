package com.pojo.example;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeePojoArryList {
	public static void main(String[]args) {
		
System.out.println("Using for Constructor :");	
		Employee emp=new Employee(1,"Sanu sir",20);
		
		
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	System.out.println(emp.getAge());
		
//		System.out.println(" id="+emp.getId()+"name="+emp.getName()+"age="+emp.getAge());
		
		System.out.println("using for Setter & getter :");
	Employee emp1=new Employee(2,"Dibya",21);
	emp1.setId(2);
	emp1.setName("Dibya");
	emp1.setAge(21);
	
	System.out.println(emp1.getId());
	System.out.println(emp1.getName());
	System.out.println(emp1.getAge());
	
	System.out.println("Taking variable for employee 3");
	
	Employee emp2=new Employee(3,"Rudra",22);
	
	 ArrayList<Employee> al=new ArrayList<Employee>();
	 
	 al.add(emp);
	 al.add(emp1);
	 al.add(emp2);
	 
	 System.out.println("Using for loop");
	 
	 for(int i=0;i<al.size();i++) {
		 
		 Employee empl=al.get(i);
		 
		 System.out.println(empl.getId());
		 System.out.println(empl.getName());
		 System.out.println(empl.getAge());
		 
	 }
	 System.out.println("Using for each");
	 {
	 System.out.println(emp.getId());
	 System.out.println(emp.getName());
	 System.out.println(emp.getAge());
	 }
	
	System.out.println("Using Iterator");
	Iterator ir=al.iterator();
	while(ir.hasNext()) {
		Object obj=ir.next();
		Employee empl1=(Employee)obj;
		
		System.out.println(empl1.getId());
	    System.out.println(empl1.getName());
	    System.out.println(empl1.getAge());
	}
	
}
}
