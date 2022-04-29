package com.aboutStringBufferAndStringBuilder;

public class Example1 {

	public static void main(String[] args) {
		
		
		StringBuffer name=new StringBuffer("charles");
		name.append("nivi");
		System.out.println(name);
		
		System.out.println("================");
		
		StringBuilder myname=new StringBuilder("kennedy");
		myname.append("nivi");
		System.out.println(myname);

	}

}
