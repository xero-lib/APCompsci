//NAME: Jonathan Kurtz

import java.util.Scanner;


public class _ConvertFeet
{
    public static void main(String[] args) 
    {
    	System.out.println("Hello World!\n");
    	
    	Scanner in = new Scanner(System.in);
    	
    	System.out.println("Enter the feet you wish to convert to yards");
    	
    	double numberFeet = in.nextDouble();
    	
    	double numberYards = numberFeet / 3;
    	
    	System.out.println("Number of feet: " + numberFeet);
    	System.out.println("Number of yards: " + numberYards);
    	
    	
    	
    	
    }
    
    
}