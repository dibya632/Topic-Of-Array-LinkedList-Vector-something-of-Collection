package com.set.example;

import java.util.Iterator;
import java.util.TreeSet;

public class StringHomogeniousTreeSetGeneric {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();

		ts.add("Sanu Sir");
		ts.add("Dibya");
		ts.add("Rudra");
		ts.add("Susant");
		ts.add("Pinku");
		ts.add("Sumesh");
		
		System.out.println("The List of Name is:"+ts);
		
		for(int i=0;i<ts.size();i++);
		System.out.println("The Total on of TreeSet is:");
		
		Iterator ir=ts.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
