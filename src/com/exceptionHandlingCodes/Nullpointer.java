package com.exceptionHandlingCodes;

public class Nullpointer {
    public static void main(String[] args) {
        String text = null;

        try {
            System.out.println(text.length()); 
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        finally 
        {
        	System.out.println("array");
        }
    }
    
}


