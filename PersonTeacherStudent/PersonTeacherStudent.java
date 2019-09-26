//NAME:  Your name here
import java.util.Scanner;


public class PersonTeacherStudent
{
    public static void main(String[] args) 
    {
    	// Prepare to receive input
    	Scanner scan = new Scanner(System.in);
    	
    	// Create a person object
    	Person me = new Person("Jessica", "12 Meadow Dr");
    
    	/* Overrides the usual toString method of a Person object.
    	 * The class Person contains its own toString method.
    	 * This allows the programmer to format an object nicely.
    	 */
       // System.out.println(me);
    	 
    	
    	
    	/* Now test the Person.setName and Person.setAddress methods.
    	 * These are called MUTATORS because they change the object.
    	 * They are also called 'set' methods.
    	 */
    	// me.setName("Anna");
    	// me.setAddress("123 Main");
    	 
    	 
    	 
    	/* Now test the Person.getName and Person.getAddress methods.
    	 * These are called ACCESORS because they just look at or view the object.
    	 * These are also called 'get' methods.
    	 */ 
    	// System.out.println("NAME                " + me.getName());
    	// System.out.println("ADDRESS             " + me.getAddress());
    	
    	System.out.println();
    	System.out.println();
    	System.out.println("----------------------------");
    	System.out.println();
    	System.out.println();
    	
    	
    	
    	// Create and print a Teacher object.
    	// Teacher myTeacher = new Teacher( ???? );
    	System.out.println("This is the result of printing myTeacher object:");
    	// System.out.println(myTeacher);
    	// Use the method addCourse to add the name two courses for the teacher.
    	
    	System.out.println(); // leave this line to have a blank line on output
    	
    	
    	
    	// Use the get methods to print the teacher name, 
    	//   address, courses, and number of courses.
    	System.out.println("This is the result of printing myTeacher get methods:");
    	System.out.println(  );
    	System.out.println(  );
    	System.out.println(  );
		System.out.println(  );
    	System.out.println(); // leave this line to have a blank line on output
    	
    	
    	// Create and print a Student object.
    	// Student myStudent = new Student( ???? );
    	// myStudent.addCourse( ???? );
    	// add 2 more courses
    	
    	
    	//print all things myStudent including NAME, ADDRESS and AVERAGE
    	System.out.println(); // leave this line to have a blank line on output
    	System.out.println("This is the result of printing myStudent get methods:");
    	System.out.println(  );
    	System.out.println(  );
    	System.out.println(  );
    	
    	
    	
    	
    } // this brace ends the main method
    
} // this brace ends the class.
