package com.exceptionHandlingCodes;

import java.util.Scanner;

public class Stringindexoutofbound {
    
    public static void main(String[] args) {
        
        String arr = "ajaz";
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an index: ");
        
        try {
            int index = scanner.nextInt();
            System.out.println("Character: " + arr.charAt(index));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("after String");
        }
    }
}