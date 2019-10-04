//NAME:  Ms. Griffin

import java.util.Scanner;


public class PayrollLoop
{
    public static void main(String[] args) 
    {
    // Prepare to receive output
    Scanner scan = new Scanner(System.in);
    
    // initialize variables
    int numberEmployees = 0;
    double totalGrossPay = 0;
    double averagePay = 0;
    
    Payroll employee = new Payroll();
    String repeat = "yes";
    
    // Loop to ask for repeated entry of employees.
    // New String method: stringObject.equals(anotherStringObject). 
    // This method returns a boolean value of True or False.
    
    while ( repeat.equals("yes") )	
    {
    	// prompt and scan for employee name    	
    	System.out.print("Enter the name:	");
    	employee.setName( scan.next() );
    	
    	// prompt and scan for ID number
    	System.out.println("Enter the id number:	");
    	employee.setIdNumber( scan.nextInt() );
    	// prompt and scan for pay rate
    	System.out.println("Enter the pay rate: 	")
    	
    	// prompt and scan for hours worked
    	
    	
    	// what should you do to the numberEmployees variable here?
    	
    	
    	// what should you do to the totalGrossPay variable here?
    	
    	
    	// use the getter methods to print all the employee values
    	
    	
    	// Ask user if entering another and scan for response
    	
    	
    	
    } // end of the while loop	
    	
    	
    	
    // calculate average pay
    
    
    
    // print average pay
    
    
    
    
    	    	
    } // end of main method    
} // end of class (the whole file)