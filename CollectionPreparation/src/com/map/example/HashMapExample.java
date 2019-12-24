package com.map.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class HashMapExample {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1,"Dibya" );
		hm.put(2, "Sanu Sir");
		hm.put(3, "Rudra");
		hm.put(4, "Susant");
		
		System.out.println(hm);
		System.out.println(hm.get(1));
		
		
		Set Keys=hm.keySet();
		
		System.out.println(Keys);
		Iterator ir=Keys.iterator();
		
		while(ir.hasNext()) {
			System.out.println(hm.get(ir.next()));
		}
		

	}

}
