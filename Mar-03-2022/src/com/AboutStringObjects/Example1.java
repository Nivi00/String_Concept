package com.AboutStringObjects;

public class Example1 {

	public static void main(String[] args) 
	{

		//using literals
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hi";
		
		System.out.println(s1 == s2);
		
		System.out.println("==========================");
		
		//using new keyword
		String s11 = new String("Hello");
		String s12 = new String("Hello");
		String s13 = new String("Hi");
		
		System.out.println(s11 == s12);

	}

}
