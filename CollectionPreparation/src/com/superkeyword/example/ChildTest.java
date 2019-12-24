package com.superkeyword.example;

public class ChildTest extends ParentTest{
	int y=20;
	
	public ChildTest() {
		super();
		System.out.println("Hii i am child constructor");
		
	}
	public ChildTest(int x) {
		System.out.println("Hii i am child paramatrized Constructor");
		System.out.println("Input value:"+x);
	}

}
