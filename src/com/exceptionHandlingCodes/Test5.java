package com.exceptionHandlingCodes;


import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number");
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		A obj=new A();
		obj.div(n,m);
		obj.display();

	}

}