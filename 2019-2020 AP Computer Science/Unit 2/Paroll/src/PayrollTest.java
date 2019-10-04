//NAME:  Mrs. Griffin

import java.util.Scanner;

public class PayrollTest
{
    public static void main(String[] args) 
    {
     	
     	/*
     	 *  To run this program, you must have the Payroll.class file
     	 *  in the same folder as the PayrollTest.java file.
     	 */
     	
     	// prepare to receive input
     	Scanner scan = new Scanner(System.in);
    	
    	// Create two Payroll objects
    	Payroll julianPayroll = new Payroll();
    	Payroll lucPayroll = new Payroll();
    	
    	// Set attributes of the first object
    	julianPayroll.setName("Julian");
    	julianPayroll.setIdNumber(100);
    	julianPayroll.setPayRate(10.00);
    	julianPayroll.setHoursWorked(2.5);
    	
    	
    	// Set attributes of the second object
    	lucPayroll.setName("Luc");
    	lucPayroll.setIdNumber(101);
    	lucPayroll.setPayRate(11.00);
    	lucPayroll.setHoursWorked(0.6);
    	
    	
    	// View the objects using the toString method that is included in the class
    	System.out.println();
		System.out.println();
    	System.out.println(julianPayroll);
		System.out.println(lucPayroll);
		System.out.println();
		System.out.println();
    	
    	
    	// Call all of the GET methods to print data in a nicer format.
    	// Do this for both objects.
    	System.out.println("Name         " + julianPayroll.getName());
    	System.out.println("Id number    " + julianPayroll.getIdNumber());
    	System.out.println("Pay rate     " + julianPayroll.getPayRate());
    	System.out.println("Hours Worked " + julianPayroll.getHoursWorked());
    	System.out.println("Gross Pay    " + julianPayroll.grossPay());
    	System.out.println();
    	System.out.println();

  
          
    } // this brace ends the main method
    
} // this brace ends the class.
