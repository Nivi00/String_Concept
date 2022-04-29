package com.aboutStringBufferAndStringBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	public static void main(String[] args) throws  IOException
	{
		//you can input from BufferedReader and InputStreamReader
		
		String name="";
		int age=0;
		float salary=0.0f;
		
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		//or
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		
		name = br.readLine();
		System.out.println("Enter age");
		age = Integer.parseInt(br.readLine());
		System.out.println("Enter salary");
		salary = Float.parseFloat(br.readLine());
		
		System.out.println("Details of Employee");
		System.out.println("name"+name);
		System.out.println("age"+age);
		System.out.println("salary"+salary);
	}

}
