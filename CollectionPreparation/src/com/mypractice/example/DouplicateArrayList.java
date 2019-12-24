package com.mypractice.example;

import java.util.ArrayList;

public class DouplicateArrayList {
	public static void main(String[]args) {
		int sum=0;
		
		int[] a= {10,20,20,30,50,60,70,100};
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(100);
		
		System.out.println("The list value of ArrayList:"+al);
		
		for(int i=0;i<al.size();i++) {
			sum=sum+a[i];
		}
		
	}

}
