//NAME:  Class Notes Jan 10 & 13
import java.util.Scanner;

/*
 * The goal of this program is to show a common algorithm
 * for counting the number of times an entry is in an array.
 *
 * Here, the array is a list of integers, but you could count occurrences 
 * in an array with other data types.
 */

public class _03_CountOfSomething
{
    public static void main(String[] args) 
    {
 	// Create an array by declaring the element values directly.   
    int[] ageList = {45, 13, 16, 26, 34, 68, 79, 81, 36};	
    
    // Print the elements in the array to confirm.
    for (int i=0; i<ageList.length; i++)
    	System.out.print(ageList[i] + " ");
    System.out.println();
    
    // COMMON ALGORITHM:
    // Count the number of ages that are: even ; greater than 40 ; between 15 and 30 inclusive
    int evenCount = 0, greatCount = 0, btwnCount = 0;
    
    for (int i = 0; i<ageList.length; i++)
    {
    	if (ageList[i]%2==0)
    		evenCount++;
    		
    	if(ageList[i] > 40)
    		greatCount++;
    		
    	if(ageList[i] >= 15 && ageList[i] <= 30)
    		btwnCount++;
    			
    }
    
    /*
     * The general formula for 'count something' algorithm is:
     *	
     *	int count = 0; //initialize the count variable before the loop
     *
     *	for (int i = 0; i<listName.length; i++)
     *	{
     *		if ( logical_condition_here)
     *			count++;
     *	}
     */	
    
    // Display the results
    System.out.println("Number of elements that are even: " + evenCount );
    System.out.println("Number of elements greater than 40: " + greatCount  );
    System.out.println("Number of elements 15-30: " + btwnCount  );
    
    	    	
    }//end of main   
}//end of class