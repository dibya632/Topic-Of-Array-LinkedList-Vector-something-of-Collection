package com.set.example;

import java.util.Iterator;
import java.util.TreeSet;

public class IntegerHomogeniousTreeSetGeneric {
	public static void main(String[]args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(123456);
		ts.add(333333);
		ts.add(666666);
		ts.add(1111);
		
		for(int i=0;i<ts.size();i++);
		System.out.println(ts);
		
		Iterator ir=ts.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
	}

}
