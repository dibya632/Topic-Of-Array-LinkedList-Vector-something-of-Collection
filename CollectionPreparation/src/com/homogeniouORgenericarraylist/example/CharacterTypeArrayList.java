package com.homogeniouORgenericarraylist.example;

import java.util.ArrayList;
import java.util.Iterator;

public class CharacterTypeArrayList {
	public static void main(String[]args) {
		ArrayList<Character> al=new ArrayList<Character>();
		
		al.add('g');
		al.add('f');
		al.add('d');
		
		System.out.println("The list is:\n"+al);
		
		Iterator ir=al.iterator();
		
		System.out.println("The total Iterator number is:");
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
	}

}
