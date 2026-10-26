package com.exceptionHandlingCodes;
import java.util.Scanner;

public class Arrayindexoutofbound {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt();

        try 
        	{
            System.out.println(numbers[index]);
            }
        catch (ArrayIndexOutOfBoundsException e)
        	{
            System.out.println(e);
        } finally {
        	
            System.out.println("after run");
            
        }
    }
}