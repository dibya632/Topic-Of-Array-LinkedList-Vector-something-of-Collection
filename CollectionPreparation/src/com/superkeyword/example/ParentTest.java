package com.superkeyword.example;

public class ParentTest {

	int x=10;
	public ParentTest()
	{
		System.out.println("Hii i am Parent Constructor");
	}
	public ParentTest(String name) {
		System.out.println("Hii i am Parent Parametrized constructor");
		System.out.println("Input value"+name);
		
	}
	
}
