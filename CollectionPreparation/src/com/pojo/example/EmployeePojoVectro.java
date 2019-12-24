package com.pojo.example;
import java.util.Enumeration;
import java.util.Vector;

public class EmployeePojoVectro {
	public static void main(String[]args) {
		
		System.out.println("Using Constructor");
		Employee emp=new Employee(9,"Sanu sir",25);
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		
//	System.out.println("id="+emp.getId()+"name="+emp.getName()+"age="+emp.getAge());	
		
		System.out.println("Using Setter & Getter");
		
		Employee emp1=new Employee();
		emp1.setId(14);
		emp1.setName("Pinku");
		emp1.setAge(23);
		
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getAge());
		
		Employee emp2=new Employee(3,"Sumesh",22);
		
		System.out.println("Usong Link List");
		
		Vector<Employee> v=new Vector<Employee>();
		v.add(emp);
		v.add(emp1);
		v.add(emp2);
		 
		
		System.out.println("Using For loop");
		for(int i=0;i<v.size();i++) {
			Employee empl=v.get(i);
			
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
		System.out.println("Using causor Enumeration");
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
		Object obj=e.nextElement();
		Employee empl1=(Employee)obj;
		
		
		System.out.println(empl1.getId());
		System.out.println(empl1.getName());
		System.out.println(empl1.getAge());
			
		}
	}

}
