package com.heterogeniousarraylist.example;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkListHeterogenious {
	public static void main(String[]args) {
		LinkedList ll=new LinkedList();
		
		ll.add("Sanu Sir");
		ll.add(100);
		ll.add(5.7f);
		ll.add(true);
		ll.add("Dibya");
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		ListIterator li=ll.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
	}

}
