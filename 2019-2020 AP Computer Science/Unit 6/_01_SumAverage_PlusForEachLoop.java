//NAME:  Class Notes Jan 10 & 13
import java.util.Scanner;

/*
 * The goal of this program is to show a common algorithm
 * for finding the sum and the average of an array of numbers.
 *
 * It also introduces a FOR EACH loop.
 *
 */

public class _01_SumAverage_PlusForEachLoop
{
    public static void main(String[] args)
    {
   	// Creating the array of integers
    int[] numbers = new int[25];
   
   	// Generating random numbers, from ????? inclusive, to fill the array
    for (int i = 0; i < numbers.length; i++)
    	numbers[i] = (int)(Math.random()*100); 
   
   
   
   	/* 
   	 *  NEW STRUCTURE BELOW:  
   	 *    	FOR EACH loop -- For each element in numbers, print the element.
   	 *	
   	 *	NOTE:
   	 *		In a Java FOR EACH loop, you are only allowed to access the elements
   	 *		of the array. You do not have access to the index.
   	 *		
   	 *  CODE:
   	 *		for ( data_type  variable_for_element : variable_for_array )
   	 *
   	 */
    
    // Print out each element, followed by a space, on a single line
    for (int element : numbers) 
    	System.out.print(element+" ");
   
    System.out.println();
    
    int sum = 0;  
    double average = 0;  
   
    // COMMON ALGORITHM: Sum all the numbers in an array. Then find the average.
    for (int i=0; i<numbers; i++)
    {
    	sum = sum + numbers[i]; //equivilent to: sum += numbers[i];
    }
        
   
     // Casting required or 8.959 would become 8.
   
    System.out.println("The sum is " + sum);
    System.out.println("The average is "+ average);
   
    }//end of main
} // this brace ends the class.