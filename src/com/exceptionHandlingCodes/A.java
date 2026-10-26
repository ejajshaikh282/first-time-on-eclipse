package com.exceptionHandlingCodes;

public class A {
	
	public void div(int a, int b) throws ArithmeticException,ArrayIndexOutOfBoundsException,NullPointerException
	{
		
		try {
			 try 
			 {
		int c=a/b;
		System.out.println("division "+c);
			 }
			 catch(ArithmeticException e1)
				{
					System.out.println(e1);
				}
			 
		try
		{
		int arr[]= {10,20,30};
		System.out.println("Array: "+arr[6]);
		}
		
		
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println(e2);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			
	finally
	{
		System.out.println("inside finally");
	}
		
		System.out.println("after catch");
	}
	
	public void display()
	{
		System.out.println("inside display");
	}
	

	

}