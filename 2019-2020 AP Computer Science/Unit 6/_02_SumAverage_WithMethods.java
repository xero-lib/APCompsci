//NAME:  Class Notes Jan 10 & 13
import java.util.Scanner;

// This import means you can just type out.println instead of System.out.println
import static java.lang.System.*; 

/*
 * The goal of this program is to show a common algorithm
 * for finding the sum and the average of an array of numbers.
 *
 * The program introduces writing Methods that will do 
 * the sum and the average.
 *
 */

public class _02_SumAverage_WithMethods
{
    public static void main(String[] args)
    {   	
   	// Creating the array of integers    
    int[] numbers = new int[25];
   
   	// Fill the array with random integers from 0-99.
    for (int i=0; i<numbers.length; i++)
    	numbers[i] = (int) (Math.random() * 100);
   
   
    // Call the methods within print statements.
    // The code of the methods is further down the page. 
    out.println("The sum is "  + sum(numbers) );
    out.println("The average is " + average(numbers) );
   
    }
    //***********NOTE: the above } brace ends the main method***********************
   
   
   	/*
   	 * METHODS: Must be done outside the {} for the main method. Must be static.
   	 * 
   	 * Method Header: public static return_type method_name(_parameters_)
   	 *
   	 */
   	 
   	 
   	// METHOD for sum: 
    public static int sum(int[] numbers)
    {
    	int sum = 0; //local variable; scope inside this function only
    	
    	for (int i = 0; i<numbers.length; i++)
    		sum += numbers[i];
    		
    	return sum;
    }
    
    
    // METHOD for average:
    public static double average(int[] numbers)
    {
    	int sum = sum(numbers);
    	
    	return (double)sum/numbers.length;
    }
    
    
    
}//end of class