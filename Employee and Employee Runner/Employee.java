import java.util.Scanner;

public class Employee
{
    // global variables of Employee class 
    // Also know as attributes
    // Typically declared private
    
        //Employee name
        //Employee ID number
        //Department within the company
        //Job position title
    
    /*
     * After the attributes, typically the next code 
     * contains the constructors for the class.
     * A class can have more than one constructor.
     * If a class has more than one constructor, we call it
     * 'overloading' the constructor.
     */
     
     /*
      * There are 4 rules for constructors:  (** These make good test questions! **)
      * (1)
      * (2)
      * (3)
      * (4)
      */
    
    
    // First constructor. Know nothing about the employee.
    public Employee()
    {
    	name = "";
    	idNumber = 0;
    	dept = "";
    	position = "";
    }
    
    
    // Typically, the next thing to write is a toString method.
    // Why? We want to see the object, not the memory address.
    public String toString()
    {
    	return name + " * " + idNumber + " * " + dept + " * " + position;
    }
    
    
    
    // Second constructor. Know only name and ID number.  
    public Employee(String name, int idNumber)
    {
    	this.name = name;
    	this.idNumber = idNumber;
    	dept = "";
    	position = "";
    }
    
    
    // Third constructor. Know name, ID number, department, and position.  
        
     public Employee(String name, int idNumber, String dept, String position)
    {
    	this.name = name;
    	this.idNumber = idNumber;
    	this.dept = dept;
    	this.position = position;
    }
    
    
    // Question: What is the benefit of having multiple ways to create employees?
    // Answer: 
    	
    
    // "Setter" methods. Also know as MUTATORS.
    // These methods allow the main program to make changes to the object.
    // Note that to make these changes, the main program must do so
    // indirectly. That is, the main program has to go through the object's
    // methods to make changes.
    public void setName(String name)
    {
    	this.name = name;
    }
    public void setIdNumber(int idNumber)
    {
    	this.idNumber = idNumber;
    }
    public void setDept(String dept)
    {
    	this.dept = dept;
    }
    public void setPosition(String position)
    {
    	this.position = position;
    }
    
    
    
    // "Getter" methods. Also know as ACCESSORS.
    // These methods allow the main program to display information
    // about the object. Note that to do this, the main program 
    // has to go through the object's methods to make changes.
    // The main program cannot display the attributes directly.
    public String getName()
    {
    	return name;
    }
    public int getIdNumber()
    {
    	return idNumber;
    }
    public String getDept()
    {
    	return dept;
    }
    public String getPosition()
    {
    	return position;
    }
    
    
} //end of class Employee