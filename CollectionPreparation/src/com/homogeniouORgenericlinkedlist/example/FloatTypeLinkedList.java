package com.homogeniouORgenericlinkedlist.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class FloatTypeLinkedList {
	public static void main(String[]args) {
		LinkedList<Float> ll=new LinkedList<Float>();
		
		ll.add(100f);
		ll.add(222f);
		ll.add(6666f);
		System.out.println("The list value is:"+ll);
		ListIterator li=ll.listIterator();
		
		System.out.println("The total ListIterator Value is:");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
