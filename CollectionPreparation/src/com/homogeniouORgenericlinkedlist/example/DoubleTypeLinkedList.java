package com.homogeniouORgenericlinkedlist.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class DoubleTypeLinkedList {
	
	public static void main(String[]args) {
		LinkedList<Double> ll=new LinkedList<Double>();
		
		ll.add(19.999d);
		ll.add(10.5555d);
		ll.add(5.5555d);
		
		System.out.println("The List value is:"+ll);
		ListIterator li=ll.listIterator();
		System.out.println("The total ListIterator value is:");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
	}

}
