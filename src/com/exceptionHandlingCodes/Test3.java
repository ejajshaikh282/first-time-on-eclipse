package com.exceptionHandlingCodes;

public class Test3 {
	
	public static void main (String[] args) {
		
		String str = null;
		System.out.println(str);
		 
		//System.exit(0); //for stop program forcefully
		try
		{
			System.out.println("length :"+str.length());
			
		}
		catch(NullPointerException e)
		{
			//System.out.println(e);
			e.printStackTrace();//to show exception
			
		}
		finally
		{
			System.out.println("inside finally");
		}
		
	}

}
