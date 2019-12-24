package com.homogeniouORgenericlinkedlist.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class StringTypeLinkedList {
	public static void main(String[]args) {
		LinkedList<String> ll=new LinkedList<String>(); 
		
		ll.add("Sanu sir");
		ll.add("Dibya");
		ll.add("XYZ");
		
		System.out.println("The list value is:"+ll);
		
		ListIterator li=ll.listIterator();
		
		System.out.println("The total ListIterator Value is:");
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
	}

}
