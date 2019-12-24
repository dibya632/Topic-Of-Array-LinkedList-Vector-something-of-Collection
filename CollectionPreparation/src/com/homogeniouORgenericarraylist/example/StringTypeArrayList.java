package com.homogeniouORgenericarraylist.example;

import java.util.ArrayList;
import java.util.Iterator;

public class StringTypeArrayList {
	public static void main(String[]args) {
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Sanu Sir");
		al.add("Dibya");
		al.add("XyZ");
		
		System.out.println("The list is:\n"+al);
		
		Iterator ir=al.iterator();
		
		System.out.println("The iterator value of list are:");
		
		while(ir.hasNext()) {
			System.out.println(ir.next()+"");
		}
	}

}
