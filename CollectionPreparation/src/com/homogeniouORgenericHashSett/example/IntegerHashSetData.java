package com.homogeniouORgenericHashSett.example;

import java.util.HashSet;
import java.util.Iterator;

public class IntegerHashSetData {
	public static void main(String[]args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(11111);
		hs.add(2222222);
		hs.add(3333333);
		
		System.out.println("The List value of HashSet:"+hs);
		
		hs.remove(11111);
		
		System.out.println("Removing the 11111 then"+hs);
		
		Iterator ir=hs.iterator();
		System.out.println("The total Iterator value is:");
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}

}
