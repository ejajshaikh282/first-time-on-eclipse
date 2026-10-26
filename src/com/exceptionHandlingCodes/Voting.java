package com.exceptionHandlingCodes;

public class Voting {
	public void  checkAge(int age)
	{
		if(age >= 18)
		{
			System.out.println("you can vote");
		}
		else
		{
			try 
			{
				throw new ArithmeticException("Access denied : you must be atleast 18 years old");
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
	
	System.out.println("hiiii");
	}
}