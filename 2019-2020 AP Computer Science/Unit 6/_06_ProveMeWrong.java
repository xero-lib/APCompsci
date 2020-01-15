//NAME:  Class Notes for Jan 10 & 13

import java.util.Scanner;

/*
 * The goal of this program is to show a common algorithm
 * for finding if a statement is true or false about an array.
 *
 */
 
public class _06_ProveMeWrong
{
    public static void main(String[] args) 
    {
	//Create the arrays    
    int[] nList = {21, 65, -3, 77, 99};
    	
    // Call the methods for testing statements
    System.out.println("nList only has numbers less than 80: "+ isLess80(nList));
    System.out.println("nList only has positive numbers: "+ allPositive(nList));
    System.out.println("nList only has odd numbers: "+ isOdd(nList));	
    	    	
    }//end of main
        
    /*
   	 * METHODS: Must be done outside the {} for the main method
   	 * 
   	 * Method Header: public static return_type method_name(_parameters_)
   	 *
   	 */
    
    public static boolean isLess80(int[] nList)
    {
    
    return true;
    }  
    	
    public static boolean allPositive(int[] nList)
    {
    
    return true;
    }  
    	
    public static boolean isOdd(int[] nList)
    {
    
    return true;
    }    
    
}//end of class