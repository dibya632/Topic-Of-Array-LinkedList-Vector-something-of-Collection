package com.homogeniouORgenericarraylist.example;

import java.util.ArrayList;
import java.util.Iterator;

public class LongTypeArrayList {

	public static void main(String[]args) {
		ArrayList<Long> al=new ArrayList<Long>();
		al.add(24l);
		al.add(205l);
		al.add(199l);
		
		System.out.println("The List Value is:"+al);
		
		Iterator ir=al.iterator();
		
		System.out.println("The total Iterator value is:");
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
	
}
