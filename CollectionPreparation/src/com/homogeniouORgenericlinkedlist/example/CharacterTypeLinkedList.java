package com.homogeniouORgenericlinkedlist.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class CharacterTypeLinkedList {
	public static void main(String[]args) {
		LinkedList<Character> ll=new LinkedList<Character>();
		ll.add('S');
		ll.add('d');
		ll.add('s');
		
		System.out.println("The list value is:"+ll);
		
		ListIterator li=ll.listIterator();
		System.out.println("The total LinkedList Value is:");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
	}

}
