package com.exceptionHandlingCodes;

import java.util.Scanner;

public class Test4 {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a roll no:");
		int rno = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter name:");
		// FIX: Changed sc.next() to sc.nextLine() to prevent buffer issues
		String name = sc.nextLine(); 
		
		System.out.println("Enter a marks:");
		Float mks = Float.parseFloat(sc.nextLine());
		
		System.out.println("rno : " + rno + "\tname : " + name + "\tMks : " + mks);
		
		sc.close(); // Good practice to close the scanner4
	}
}