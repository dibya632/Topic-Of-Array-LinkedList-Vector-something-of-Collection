package com.collectionarray.example;

import java.util.HashSet;

public class HashSetAdd {
	public static void main(String[]args) {
		
		int sum=0;
		
		int[] a= {10,20,20,30,50,60,70,100};
		
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		hs.add(50);
		hs.add(60);
		hs.add(70);
		hs.add(100);
		
		System.out.println(hs);
		
		
		for(int i=0;i<a.length;i++) {
			
			sum=sum+a[i];
			
		}
		
		System.out.println("Sum of the total value: "+sum);
		
		
		
	}

}
