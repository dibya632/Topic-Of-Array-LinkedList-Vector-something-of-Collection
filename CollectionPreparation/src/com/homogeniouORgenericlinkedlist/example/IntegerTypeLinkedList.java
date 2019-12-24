package com.homogeniouORgenericlinkedlist.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class IntegerTypeLinkedList {

	public static void main(String[] args) {
	
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		ll.add(105);
		ll.add(108);
		ll.add(105);
		ll.add(103);
		
		System.out.println("The List value is:"+ll);
		
		ListIterator li=ll.listIterator();
		
		System.out.println("The total ListIterator value is:");
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}

	}

}
