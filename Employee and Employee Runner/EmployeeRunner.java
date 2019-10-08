//NAME:  Your Name here

import java.util.Scanner;


public class EmployeeRunner
{
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
    	
    	// Creating three instances of the Employee class.
    	// This allows us to test each of the three constructors.
    	// The creators of Java made it so that the object will 
    	// be created by choosing which constructor has the
    	// correct parameters.  
    	
    	Employee emp1 = new Employee();
    	Employee emp2 = new Employee("Connor", 123);
    	Employee emp3 = new Employee("Fin", 224, "Finance", "Vice President");
    	
    	// Now print the objects to test the toString method
    	// and the constructors.
    	System.out.println(emp1 + "\n" +
    					   emp2 + "\n" + 
    					   emp3 + "\n");
    	
    	
    	
    	// Now use the 'set' methods to change the objects.
   		emp1.setName("Amogh");
   		emp1.setIdNumber(321);
   		emp1.setDept("Marketing");
   		emp1.setPosition("Chief Officer");
   		
   		emp2.setDept("Engineering");
   		emp2.setPosition("Senior Engineer");
   		
   		emp3.setPosition("Senior Vice President");
    	
    	
   	
    	
    	
    	// Now test the 'get' methods. You do this by printing 
    	// the outputs.  This also helps us verify that the 'set'
    	// methods worked correctly.
    	System.out.println("Employee 1");
    	System.out.println(emp1.getName());
    	System.out.println(emp1.getIdNumber());
    	System.out.println(emp1.getDept());
    	System.out.println(emp1.getPosition());
    	
    	
    	
    	
    	
    	    	    	
    } //end of main
} //end of class