package com.mypractice.example;

import java.util.HashSet;

public class DuoplicateExample {

	public static void main(String[]args) {
		int result=0;
		
		int[] a= {12,13,34,12,42,23,35};
		
		HashSet hs=new HashSet();
		hs.add(12);
		hs.add(13);
		hs.add(34);
		hs.add(12);
		hs.add(42);
		hs.add(23);
		hs.add(35);
		
		System.out.println(hs);
		

		
		for(int i=0;i<hs.size();i++) {
			
			result=result+a[i];
		
		}
		System.out.println(result);
	}
	
}
