package com.pojo.example;


import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeePojoLinkList {
	public static void main(String[]args) {
		System.out.println("Using for constructor");
		Employee emp=new Employee(4,"Sanu Sir",24);
		
		
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		
//		System.out.println("id="+emp.getId()+"name="+emp.getName()+"age="+emp.getAge());
		
		System.out.println("Using Setter & Getter");
		
		Employee imp1=new Employee();
		
		imp1.setId(5);
		imp1.setName("Sumesh");
		imp1.setAge(25);
		
		System.out.println(imp1.getId());
		System.out.println(imp1.getName());
		System.out.println(imp1.getAge());
		
		
		System.out.println("Using for instance Method");
		
		Employee emp2=new Employee(6,"Susant",26);
		
		LinkedList<Employee> ll=new LinkedList<Employee>();
		
		ll.add(emp);
		ll.add(imp1);
		ll.add(emp2);
		
		System.out.println("Using for forloop");
		
		for(int i=0;i<ll.size();i++) {
			Employee empl=ll.get(i);
		
		System.out.println(empl.getId());
		System.out.println(empl.getName());
		System.out.println(empl.getAge());
	}
	System.out.println("using foreach loop");
	{
	
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	System.out.println(emp.getAge());
	}
	
		System.out.println("by Using ListIterator");
		ListIterator li=ll.listIterator();
		while(li.hasNext()) {
				Object obj=li.next();
			Employee empl1=(Employee)obj;
			System.out.println(empl1.getId());
			System.out.println(empl1.getName());
			System.out.println(empl1.getAge());
		}
		
		
	}

}
