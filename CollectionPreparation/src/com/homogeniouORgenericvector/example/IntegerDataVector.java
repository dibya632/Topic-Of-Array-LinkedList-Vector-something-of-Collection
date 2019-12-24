package com.homogeniouORgenericvector.example;

import java.util.Enumeration;
import java.util.Vector;

public class IntegerDataVector {
	public static void main(String[]args) {
		Vector<Integer> v=new Vector<Integer>();
		
		v.add(28);
		v.add(222);
		v.add(4444444);
		
		System.out.println("Using for loop");
		for(int i=0;i<v.size();i++) {
			System.out.println(v);
		}
		
		System.out.println("The Vactor value is:"+v);
		Enumeration e=v.elements();
		System.out.println("Total value of Enumeration is:");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
	

}
