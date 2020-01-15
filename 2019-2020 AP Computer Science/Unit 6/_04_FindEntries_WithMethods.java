//NAME:  Class notes for Jan 10 & 13

import java.util.Scanner;

/*
 * The goal of this program is to show a common algorithm
 * for finding the index (location) of an element in an array.
 *
 * The program uses methods to find in different ways. 
 */

public class _04_FindEntries_WithMethods
{
    public static void main(String[] args) 
    {
    	//Create list of state abbreviations
    	String[] stateList = {"TX","LA","TX","TX","LA","OK","NM","OK","IA","IA",
    							"OK","MN","OH","TX","OH","IA","IA","OK"};
    	
    	//Print out the list for confirmation
    	for (int i=0; i<stateList.length;i++)
    		System.out.println(stateList[i]);
    		
    	// Call the methods within print statements.
    	// The code of the methods is further down the page.
    	System.out.println("The first occurrence of LA is at index: " + findFirstLA(stateList)  );
    	System.out.println("The last occurrence of TX is at index: " + findLastTX(stateList)  );
    	System.out.println("The abbreviation IA occurs at index: " +findAllIA  );
    	    	
    } //end of main
    
    /*
   	 * METHODS: Must be done outside the {} for the main method
   	 * 
   	 * Method Header: public static return_type method_name(_parameters_)
   	 *
   	 */
    
    //Method for finding the index of the first occurrence
    public static int findFirstLA(String[] stateList)
    {
    	for (int i=0; i<stateList.length; i++)
    		if(stateList[i].equals("LA")) //use .equals for strings
    			return i;
    		return -1; //return -1 if not in list
    	
    }
    
    
    //Method for finding the index of the last occurrence
    public static int findLastTX(String[] stateList)
    {
    	for (int i=(stateList.length)-1; i>stateList.length; i--)
       		if(stateList[i].equals("TX")) //use .equals for strings
    			return i;
    		return -1; //return -1 if not in list
    	
    }
    
    
    // Method for finding the indices of all occurrences
    // Big idea: Count all IA, make array, fill array, return string
    public static Srting findAllIA(String[] stateList)
    {
    //Count IAs 
    int count=0;
    
    for(int i=0; i<stateList.length; i++)
    {
    	if(stateList[i].equals("IA"))
    		count++;
    }
    //Make Array
    int[] locations = new int[count];
    
    //Fill array
    for(int i=0; i<stateList.length; i++)
    	if(stateList[i].equals("IA"))
    	{
    		
    	}
   //Cat string for ret
    	
    }//end of findAllIA
    
    
}//end of class