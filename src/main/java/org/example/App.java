package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "What is the input string? " );
        String name = scnN.next();
        System.out.print( name +" has "+ name.length() +" characters.");
    }
}
