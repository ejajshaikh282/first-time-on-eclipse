package com.exceptionHandlingCodes;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("before array code");
		
		int arr[]= {10,20,30,40};
		
		System.out.println("displaying array elements");
		
		System.out.println("inside try block");
		try {
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("\n rohit \n");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			//e.printStackTrace();
			
			System.out.println("inside catch block");
		}
		finally {
			System.out.println("inside finally block");
		}
		
		System.out.println("end of the code");

	}

}