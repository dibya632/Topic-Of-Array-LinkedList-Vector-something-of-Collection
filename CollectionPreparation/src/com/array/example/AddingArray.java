package com.array.example;

import java.util.ArrayList;

public class AddingArray {
	public static void main(String[]args) {
		int[] a= {10,20,30,40,50};
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		ArrayList al1=new ArrayList();
		
		al1.add(60);
		al.add(70);
		
		
		System.out.println(al1.addAll(al));
		System.out.println(al.addAll(al1));
		
	}

}
