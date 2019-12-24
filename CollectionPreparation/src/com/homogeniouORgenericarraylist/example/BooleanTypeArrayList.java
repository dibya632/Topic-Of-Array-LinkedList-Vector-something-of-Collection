package com.homogeniouORgenericarraylist.example;

import java.util.ArrayList;
import java.util.Iterator;

public class BooleanTypeArrayList {
	public static void main(String[]args) {
		ArrayList<Boolean> al=new ArrayList<Boolean>();
		
		al.add(true);
		al.add(false);
		
		System.out.println("The list is:\n"+al);
		
		Iterator ir=al.iterator();
		
		System.out.println("The Total Iterator value is: ");
		
		while(ir.hasNext()) {
			System.out.println(ir.next()+"");
		}
	}

}
