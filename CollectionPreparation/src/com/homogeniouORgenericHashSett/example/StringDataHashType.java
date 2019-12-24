package com.homogeniouORgenericHashSett.example;

import java.util.HashSet;
import java.util.Iterator;

public class StringDataHashType {
	public static void main(String[]args) {
		HashSet<String> hs=new HashSet<String>();
	
		hs.add("Sanu Sir");
		hs.add("Dibya");
		hs.add("XYZ");
		System.out.println("The List of HashSet is:"+hs);
		hs.remove("XYZ");
		System.out.println("After roving the element:"+hs);
		
		Iterator ir=hs.iterator();
		
	System.out.println("The total Itarator value is:");
	
	while(ir.hasNext()) {
		System.out.println(ir.next());
	}
	}

	
}
