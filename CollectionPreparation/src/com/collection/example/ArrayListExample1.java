package com.collection.example;

import java.util.ArrayList;

public class ArrayListExample1 {
	public static void main(String[]args) {
	ArrayList al=new ArrayList();
	
	al.add(1);//0
	al.add(2);//1
	al.add(3);//2
	al.add(4);//3
	System.out.println(al);
	
	al.remove(2);//index based
	System.out.println(al);
	
	boolean value=  al.contains(4);
	System.out.println(value);
	
	
	int indexposition=  al.indexOf(2);
	System.out.println(indexposition);
	
	
	System.out.println("****************************");
	
	for(int i=0;i<al.size();i++) {
	
	
	
	System.out.println(al.get(i));
	
		
	}
	
	}

}
