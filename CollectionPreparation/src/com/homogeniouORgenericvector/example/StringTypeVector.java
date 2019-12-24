package com.homogeniouORgenericvector.example;

import java.util.Enumeration;
import java.util.Vector;

public class StringTypeVector {
	public static void main(String[]args) {
		Vector<String> v=new Vector<String>();
		
		
		v.add("Sanu Sir");
		v.add("Dibya");
		v.add("xyz");
		
		System.out.println("The Vactor value is:"+v);
		
		Enumeration e=v.elements();
		System.out.println("Total value of Enumeration is:");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
				
	}

}
