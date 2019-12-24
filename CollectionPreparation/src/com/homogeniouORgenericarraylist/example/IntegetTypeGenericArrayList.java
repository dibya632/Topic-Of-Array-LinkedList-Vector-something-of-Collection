package com.homogeniouORgenericarraylist.example;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegetTypeGenericArrayList {
	public static void main(String[]args) {
		
		
     ArrayList <Integer> al=new ArrayList <Integer>();
     
     al.add(10);
     al.add(20);
     al.add(30);
     al.add(40);
     al.add(50);
  
     System.out.println("The list is:"+al);
     
     Iterator<Integer> ir=al.iterator();
     
     System.out.println("The Iterator value of list are:");
     
     while(ir.hasNext()) {
    	 System.out.println(ir.next()+"");
     }
	}

}
