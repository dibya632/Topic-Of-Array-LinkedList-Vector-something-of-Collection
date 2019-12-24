package com.set.example;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[]args) {
		TreeSet ts=new TreeSet();
		ts.add("Sanu Sir");
		ts.add("Dibya");
		ts.add("Susant");
		ts.add("Rudra");
		
		for(int i=0;i<ts.size();i++) {
			System.out.println(ts);
			
		}
		Iterator ir=ts.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
	}

}
