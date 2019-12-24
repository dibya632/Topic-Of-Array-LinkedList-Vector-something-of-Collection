package com.heterogeniousarraylist.example;

import java.util.ArrayList;
import java.util.Iterator;

public class HetrogeniousArrayList {
	public static void main(String[]args) {
	
	ArrayList al=new ArrayList();
	
	al.add(10);
	al.add("Sanu Sir");
	al.add(5.7f);
	al.add(true);
	
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
		
	}
	Iterator ir=al.iterator(); 
	
	while(ir.hasNext()) {
		System.out.println(ir.next());
	}
	
	
	}

}
