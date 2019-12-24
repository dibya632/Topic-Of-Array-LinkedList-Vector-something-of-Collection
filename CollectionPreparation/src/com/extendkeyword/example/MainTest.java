package com.extendkeyword.example;

public class MainTest {
	public static void main(String[]args) {
		ParentTest p=new ParentTest();
		System.out.println(p.x);
		p.getParentName();
		
		ChildTest c=new ChildTest();
		System.out.println(c.y);
		c.getChildName();
		c.getParentName();
		
		ParentTest c1=new ChildTest(); 
	}

}
