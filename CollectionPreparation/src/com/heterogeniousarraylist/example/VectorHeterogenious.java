package com.heterogeniousarraylist.example;


import java.util.Enumeration;
import java.util.Vector;

public class VectorHeterogenious {
	public static void main(String[]args) {
		Vector v=new Vector();
		
		v.add("Sanu Sir");
		v.add(100);
		v.add(7.5f);
		v.add(true);
		v.add("Dibya");
		
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
	
	}
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.println();
		}
		

}
}
