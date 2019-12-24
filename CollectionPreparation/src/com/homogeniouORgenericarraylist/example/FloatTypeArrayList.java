package com.homogeniouORgenericarraylist.example;

import java.util.ArrayList;
import java.util.Iterator;

public class FloatTypeArrayList {
public static void main(String[]args) {
	ArrayList<Float> al=new ArrayList<Float>();
	
	al.add(100.5f);
	al.add(107.5f);
	al.add(105.5f);
	
	System.out.println("The list is:\n"+al);
	
	Iterator ir=al.iterator();
	System.out.println("The Eterator Value is:");
	
	while(ir.hasNext()) {
		System.out.println(ir.next()+"");
	}
	
}
}
