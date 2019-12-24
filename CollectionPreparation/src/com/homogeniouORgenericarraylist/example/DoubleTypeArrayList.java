package com.homogeniouORgenericarraylist.example;

import java.util.ArrayList;
import java.util.Iterator;

public class DoubleTypeArrayList {
public static void main(String[]args) {
	ArrayList<Double> al=new ArrayList<Double>();
	
	al.add(3.444444444);
	al.add(7.3333333333);
	al.add(9.33333333);
	
	System.out.println("The List value is:"+al);
	
	Iterator ir=al.iterator();
	
	System.out.println("The total Iterator value is:");
	
	while(ir.hasNext()) {
		System.out.println(ir.next());
	}
	
}
	
}
