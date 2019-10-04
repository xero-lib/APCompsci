//NAME: Jonathan Kurtz
// Look at GoogleSlides posted in Classwork in Google Classroom for additional study and practice.

import java.util.Scanner;

public class Test1_StudentNotes_Sept4edited
{ // Note the use of curly braces { } for grouping together code.
  // Also note that there is no ; after the class declaration. 
  // It is not a Java statement, just a class declaration.
  
  
  	// This is called the main method because of the word 'main.'
  	// Again, note that there is no ; after the main method declaration.
    public static void main(String[] args) 
    {
    //Indenting is not required for Java to work, but it is recommended. 
    //  (See the Google Java Style Guide!)


    /*
     ***** Output: print versus println
     */
    	System.out.println("First"); 	// Prints and moves to the next line.
    	System.out.print("Second");		// Prints and stays on the same line.
    	System.out.println("Third?");
    	System.out.println();
    
    
    /*
     ***** Variables and data types.  In Java, there are TWO types of data: primitives and Objects.
     *
     ***** Note the naming convention for regular variables (values that can change):
     *	      - start with lowercase letter
     *		  - use Camel Case if more than one word
     *
     ***** Note the naming convention for final variables (constants that you don't want to change):
     *		  - use ALL CAPS and an underscore as needed
     *
     */ 
    	double totalPay;	// declaring a variable
    	totalPay = 3.00;	// assigning the value 3.00 too totalPay
    	int age = 9; 		// initializing
    	
    	int tempOutside = -14;		// int can be integer from -2 billion to 2 billion
       	double hoursMonday = 7.25; 	// double stores real numbers; large range
       	double hoursTuesday = 7.5, hoursWednesday = 8.0; 	// can declare multiple of the same type on one line
       	char initial = 'p';  		// single character; primitive data type MUST USE SINGLE QUOTE
       	boolean isFinished = false;	// true or false
       	
       	final double PAY_RATE ;	// must use the word 'final' before the type int, double, etc.
 
         	
    
    /*
     ***** Escape characters (Also called Escape sequences)
     *
     ***** \t is tab		\\ prints the backslash	
     *	   \n is newline	\" prints the double quote
     */
    	System.out.println("Monday hours worked:\t" + hoursMonday);
    	System.out.println("Tuesday hours worked:\t" + hoursTuesday);
    	System.out.println("Wednesday hours worked:\t" + hoursWednesday + "\t \\ Holiday - 4th of July");
    	System.out.println("\n-- \"Thank you!\" --------------------------------");
    	System.out.println();



    /*
     ***** Reading input from the keyboard
     *
     ***** We will use the Scanner class for keyboard input.
     *     This is why we have import java.util.Scanner; at the top of the program.
     */ 
     	// Scanner scan = new Scanner(System.in); // Statement to create a Scanner object named 'scan.' 
     		// scan is the variable. It could have been named anything.
     		// Some programmers like 'keyboard' instead of 'scan.'
     		// System.in indicates where the data will be coming from.  
     		// This could be a file instead of the keyboard. 
		
		/*	Scanner methods: Use with a Scanner object to read input.
		 *    Format will be:   inputVariableName = scan.methodName();
		 */ 
    
    	Scanner scan = new Scanner(System.in);  // Prepares the Scanner object
    	int num = 0;		// Prepares the variable that will store the input.
    	String myName = "";  // Prepares a String object, initializing as an empty string.
    	
    	System.out.println("Enter a number:  ");
    	num = scan.nextInt();
    	  // Calls the nextInt() method on the scan object. Assigns to number.
    	
    	/* When scanning with nextLine() after a number (int or double), the
    	 * nextLine() ________________ instead of the text.
    	 *
    	 * To fix this, you need an extra scan.nextLine(); statement before scanning text.
    	 * This extra scan.nextLine(); captures __________ .
    	*/  	
    	scan.nextLine();     	
    	  	
    	System.out.println();
    	System.out.println("Enter your first and last name:  ");
    	//myName = scan.next();  // Returns only one string. Use nextline() to get the entire line.
    	myName = scan.nextLine();
    	
    	System.out.println();
    	System.out.println("The number entered was " + num);
    	System.out.println("The name you entered was " + myName + "\n");
		
		/*
		 * Summary of Scanner methods.  
		 * 	nextInt() - reads the next int value
		 * 	nextDouble() - reads the next double value
		 *	nextFloat() - reads the next float value
		 *  nextLong() - reads the next long value
		 *  nextByte() - reads the next byte value
		 *	nextShort() - reads the next short value
		 * 	next() - reads the next one word string
		 *	nextLine() - reads the next multi-word string	 
		 */
 
     			

    
    /*
     ***** Types of errors in programs
     */    	
    	// Syntax errors occur when something goes wrong while the program is running.
    	// The program compiles, but it gives an error once you try to run it.
    	// System.out.println("Pay deposit is next Monday.") // This line is missing a semicolon.
    	// system.out.println("Have a good day!");  // This line had a capitalization error.
    	
    	// Run-time errors occur when something goes wrong while the program is running.
    	// The program compiles, but it gives an error once you try to run it.
    	// System.out.println(age/0);  // Dividing by zero is a run-time error.
    	    
    	    
    	    
    /*
     ***** The char data type
     *
     ***** Characters in Java code appear as letters but are really stored
     *     and manipulated as ASCII values which are converted to binary values.
     */
     	//System.out.print("\n\nThe character 'A' in ASCII is 65. ");
     	//System.out.println("The character 'A' in binary is 01000001.");
     	
     	//System.out.print("\nThe character 'B' in ASCII is 66. ");
     	//System.out.println("The character 'B' in binary is 01000010.");
     	
     	//System.out.print("\nThe character 'C' in ASCII is 67. ");
     	//System.out.println("The character 'C' in binary is 01000011.");
     	
     	//System.out.println("\nThe word CAB in binary is 01000011  01000001  01000010.\n\n");
     
     	char alpha = 'A'; // Must use single quotes.
     	char ascii = 66; // Not an integer
     	char sum = 'C' + 1; // Convert 'C' to 67, then add 1, then convert back to char b/c sum is a char variable
     	
     	// Here is some strange output you might not expect.
     	// Prints the letter ?
     	System.out.println(alpha);			
     	
     	// Prints the letter ? because ascii was declared as type char, not as an int.
     	System.out.println(ascii);			
     	
     	// Prints the letter ? because adding 1 to a char moves to the next letter
     	System.out.println(sum);			
     	
     	// Prints true because it is comparing A < B. This is true since the ASCII value of A is less than that of B.
     	System.out.println(alpha < ascii);	
     
     	// See www.asciitable.com for more information on ASCII.
     	System.out.println("\nASCII values you must MEMORIZE for the AP Test:");
     	System.out.println("The ASCII value of 'A' is 65."); //Upperase + 32 = lowercase
     	System.out.println("The ASCII value of 'a' is 97.");
     	System.out.println("The ASCII value of 'space' is 32.");
		System.out.println();


    /*
     ***** String data type
     *
     ***** A String is not a primitive data type. It is an object, a group of chars.
     *     Strings are zero indexed; see below for what this means.
     */
         //System.out.println("\n  Experiments with strings.");
         
         String name = "Westwood";				
         			 // 01234567   zero-indexed means starts at 0, not 1.
         
         System.out.println(name.indexOf("W"));	// Prints 0
         System.out.println(name.indexOf("w"));	// Prints 4
         System.out.println(name.indexOf("o"));	// Prints 5 (only the first occurrence of 'o')
         System.out.println(name.indexOf("X"));	// Prints -1 because not existing
         System.out.println();
         
         System.out.println(name.charAt(0));			// Prints  the char at 0
         System.out.println(name.substring(1)); 		// Prints string starting at char 1 to the end of the string 
         System.out.println(name.substring(0,4)); 	// Prints string starting at char 0 to 3.
         												// The 4 is the first index NOT included.	
         System.out.println();
         
         
    /*
     ***** Java Math Calculations
     *
     ***** () for grouping, + for addition, - for subtraction, 
     *	   * for multiplication, / for division, and % for modulus (remainder)	
     */     
    	System.out.println("\n  Integer calculations");
    	System.out.println(17 + 5);
    	System.out.println();
    	System.out.println(17 - 5);		// Use - key next to 0 on regular keyboard, not the - on the numeric keypad.
    	System.out.println();
    	System.out.println(17 * 5);
    	System.out.println();
    	System.out.println(17 / 5);		//  This WILL BE on the TEST.
    	System.out.println();
    	System.out.println(17 % 5);		// 
    	System.out.println();
    	System.out.println("Total cost = $" + 17 + 5);	// Reminder of concatenation
    	System.out.println();
    	System.out.println("Total cost = $" + (17 + 5));
    	System.out.println();
    	
    	//System.out.println("\n  Double calculations");
    	//System.out.println(17.2 + 5.9);
    	System.out.println();
    	//System.out.println(17.2 - 5.9);		
    	System.out.println();
    	//System.out.println(17.2 * 5.9);
    	System.out.println();
    	//System.out.println(17.2 / 5.9);		//  Double devision. answer is a double.
    	System.out.println();
    	//System.out.println(17.2 % 5.9);		 
    	System.out.println();
    	//System.out.println("Distance = " + 17.2 + 5.9);	// Reminder of concatenation
    	System.out.println();
    	//System.out.println("Distance = " + (17.2 + 5.9));
    	System.out.println();
	  	
		System.out.println("\n  Mixed data type calculations");
		System.out.println( 1 / 2 );		// int div; res 0
    	System.out.println();
    	System.out.println( 1.0 / 2);		// double div; res .5
    	System.out.println();
    	System.out.println( 1 / 2.0 );		// double div; res .5
    	System.out.println();
    	System.out.println( 6/5 + 1);		//  int divl res 2
    	System.out.println();
    	System.out.println( 6/5 + 1.0);		// int div; result 2.0
    	System.out.println();
    	System.out.println( 6/5.0 + 1);		// double division; rsult is 2.2
    	System.out.println();
    	
    	// Short-cut operators for calculations
    	// Example from book: "5 Steps to a 5" by Johnson, Paymer, and Chamberlain
    	int score = 80;
    	score = score + 10;		// adds 10 to score; score now 90
    	score += 10;			// equivalent to previous line but shorter; adds 10 to score; score now 100
    	score  -= 25;			// subtracts 25 from score; score now 75
    	score *= 10;			// multiples score by 10; score now 750
    	score /= 5; 			// divides score by 5; score now 150
    	score  %= 3;				// computes score mod 3; score now 0
    	
    	// Special shortcuts for adding 1 and subtracting 1
    	score = score + 1;
    	score += 1;				
		 	// increments score by 1
			   	
    	score = score - 1;
    	score -= 1;				
		 	// decrements score by 1				
    
    	/* Java Order of operations
    	 *    highest   ( )
    	 *				!  ++  --
    	 *				/  *  %  (performed )
    	 *				+  -     (performed )
    	 *	  lowest	=  +=  -=  *=  /=  %=	
    	 */
    	//System.out.println("Order of Operations practice");
    	System.out.println( 14 / 2 * 5 );		//35 int division performed first since is left to right
    	System.out.println( 7 + (4 + 5)/2 );	//  parentheses, integer division, then add 7
    	System.out.println( 10 - 7 + 1/3);		//  integer division, then subtraction and addition left to right
    	System.out.println();
    	
     
         
    /*
     ***** Casting a variable
     *
     ***** Casting is a way to tell a variable to temporarily become a 
     *	   different type of variable in order to perform a calculation.
     *	   It does not change the original value
     *     of the variable.	
     */     
     	int number = (int)42.123;
     	//System.out.println(number);	// Prints 42
     	
     	int value = (int)153.999;
     	//System.out.println(value);	// Prints 153
     	
     	double total = (double)1/2;		// Tells 1 to act like a double for this division.
     	//System.out.println(total);		// Prints 0.5
     	
     	double commonMistake = (double)(1/2);	// Tells the result of 1/2 to act like a double.
     	//System.out.println(commonMistake);		// Prints 0.0
     	//System.out.println();
     	
     	
     	// Example: Compute a quiz grade
     	int numberCorrect = 21;		
     	int numberTotal = 24;
     	double quizGrade;		
     	
     	// We want the fraction of questions correct out of total.
     	// So we cast one of the two int values as a double.
     	// This makes that variable act like a double for the computation.
     	quizGrade = (double)numberCorrect / numberTotal; 
     	System.out.println("The fraction correct is: " + quizGrade);
     	System.out.println("The quiz grade percent is: " + quizGrade*100 + "%");
     	
    }
    
    
}