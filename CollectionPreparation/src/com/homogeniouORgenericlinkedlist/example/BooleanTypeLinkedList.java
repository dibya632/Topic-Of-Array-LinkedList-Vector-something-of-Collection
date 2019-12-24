package com.homogeniouORgenericlinkedlist.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class BooleanTypeLinkedList {
public static void main(String[]args) {
	LinkedList<Boolean> ll=new LinkedList<Boolean>();
	
	ll.add(true);
	ll.add(false);
	
	System.out.println("The list value is:"+ll);
	ListIterator li=ll.listIterator();
	
	System.out.println("Total value of ListIterator is:");
	while(li.hasNext()) {
		System.out.println(li.next());
	}
}
}
