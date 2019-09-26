//NAME:  Type your name here
import java.util.Scanner;
import java.util.ArrayList;

public class PersonLoopAssignment_Sept23_24
{
    public static void main(String[] args) 
    {
       	Scanner scan = new Scanner(System.in);
    	
    	/*
    	 * Please make sure you save this file in the same folder where the
    	 * class files are for Student.class, Person.class, and Teacher.class.
    	 *
    	 */
    	
    	// Variables; These are done. You do not have to change them.
    	int choice = 0;
    	String name = "";
    	String address = "";
    	
    	
    	System.out.println("Would you like to enter a Person, Student or Teacher?");
    	System.out.println("Enter 1 to enter a Person");
    	System.out.println("Enter 2 to enter a Teacher");
    	System.out.println("Enter 3 to enter a Student");
    	// The next line is where you ask users to enter their choice.
    	// Which seems more user-friendly? print or println ???
    	
    	System.out.print("Enter your choice:  ");
    	choice = scan.nextInt();
    	scan.nextLine();  // Leave this line here.
    	
    	
    	
    	// Ask user to enter the name. Again, think about print or println?
    	System.out.print("Enter the name:  ");
    	name = scan.nextLine(); // you'll want to account for spaces
    
    	// Ask user to enter the address
    	System.out.print("Enter the address:  ");
    	address = scan.nextLine();
    	
    	
    	
    	
    	
    	/*
    	 * ----------------Next Section of Program------------------------------------
    	 */
    	
    	
    	// Read the syntax for the 'if' statement.
    	// You must use () around the condition and a == statement to compare.
    	// You must also include { } after the 'if' statement.
    	if (choice == 1)         //start of the first 'if' statement
    	{
    		Person myPerson = new Person(name, address);
    		
    		System.out.println();
    		System.out.println("NAME:           " + myPerson.getName());
    		System.out.println("ADDRESS:        " + myPerson.getAddress());
    	}  
    	
    	
    	
    	
    	// Do the same for choice == 2 (Teacher)
    	if  ( choice == 2 )
    	{
    		//create a teacher object using the variables for name and address
    		    		
    		Teacher myTeacher = new Teacher(name, address);
    		
    		// Create 3 course variables as empty strings
    		// The first one is done for you below.
    		String course1="";
    		String course2="";
    		String course3="";
    		
    		
    		// Prompt and read in three course names (for example: Health, Algebra 1, Orchestra)
    		// The prompt and scan for the first course name are started for you.
    		System.out.print("Enter the name of the 1st course:  ");
    		course1 = scan.next();
    		
    		System.out.print("Enter the name of the 2nd course:  ");
    		course2 = scan.next();
    		
    		System.out.print("Enter the name of the 3rd course:  ");
    		course3 = scan.next();
    		
    		// Now use addCourse three times for the teacher
    		myTeacher.addCourse(course1);
    		myTeacher.addCourse(course2);
    		myTeacher.addCourse(course3);
    	
    		//print all attributes of teacher object using the GET METHODS
    		/*
    		for (int i = 0; i <3; i++) {
    		 
    			System.out.print(myTeacher.getCourses());
    		}
    		*/
    		System.out.print(myTeacher.getCourses());
    		System.out.println();
    		System.out.println("NAME:           " + myTeacher.getName());
    		System.out.println("ADDRESS:        " + myTeacher.getAddress());
   
    	} //end of if statement for choice 2
    
    
    
    
    	
    	// Create a third "if" statement for choice 3 (Student)
    	if (choice == 3)
    	{
    			   	
    		// Create a student object using the name and address from above
    		Student myStudent = new Student(name, address);
    		// add 2 courses
    		String course1="";
    		String course2="";
    		
    		int grade1 = 0;
    		int grade2 = 0;
    		
    		
    		// (Note course name and grade are the parameters)
    		
    		System.out.print("Enter the name of the 1st course:  ");
    		course1 = scan.nextLine();
    		
    		System.out.print("Enter the name of the 2nd course:  ");
    		course2 = scan.nextLine();
    		
    		System.out.print("Enter the grade of the 1st course:  ");
    		grade1 = scan.nextInt();
    		
    		System.out.print("Enter the grade of the 2nd course:  ");
    		grade2 = scan.nextInt();
    		
    		myStudent.addCourse(course1, grade1);
    		myStudent.addCourse(course2, grade2);
    		
    		// ????.addCourse("AP Physics", 80);
    		
    		//print all attributes of student object using the GET METHODS
    	
    	
    	
    	
    	
    	}
    	/*
    	 * -----------------------------------------------------------
    	 *
    	 * This is the end of the required assignment. 
    	 * 
    	 * Would you like a challenge? These are OPTIONAL.
    	 *
    	 * ----------------------------------------------------------
    	 *
    	 * 1. Can you put in a while loop like we did in the payroll,
    	 * to allow user to continue inputting various entries?
    	 *
    	 * 2. Can you figure out how to change the entry of the name, address, etc
    	 * to accept spaces without giving other errors?
    	 *
    	 * 3. Can you put in a while loop to ask the user if he/she wants to continue
    	 * adding courses to either a teacher or a student?
    	 *
    	 * 4. Can you figure out how to calculate and print the average number of courses
    	 * taught by all Teacher objects entered, including if Student or Person objects are
    	 * entered (but should not be in the teacher average)?
    	 *
    	 * 5. Can you display the total number of Person, Teacher, and Student objects
    	 * entered by the user if you loop through the program many times?
    	 *
    	 */
    	
    
    
    }//end of the main method
    
} // this brace ends the class.
