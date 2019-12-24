package com.homogeniouORgenericlinkedlist.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class LongTypeLinkedList {
	public static void main(String[]args) {
		LinkedList<Long> ll=new LinkedList<Long>();
		
		ll.add(1111l);
		ll.add(4444l);
		ll.add(0000l);
		
		System.out.println("The List value is:"+ll);
		
		ListIterator li=ll.listIterator();
		
		System.out.println("The total ListIterator value is:");
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
	}

}
