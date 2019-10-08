//NAME:  

import java.util.Scanner;


public class ShapeShifter
{
    public static void main(String[] args) 
    {
    	Scanner scan = new Scanner(System.in);
    	
    	int 
    		choice 			= 0,
    		numShape 		= 0,
    		numRectangle 	= 0,
    		numTriangle 	= 0,
    		shapeCount 		= 0,
    		rectangleCount 	= 0,
    		triangleCount 	= 0;
    	double 
    		areaTotalRectangle 		= 0,
    		areaTotalTriangle 		= 0,
    		areaAverageRectangle 	= 0,
    		areaAverageTriangle 	= 0;
    	String color = "";
    	
    	while (choice != 4) {
    		System.out.println("\n1 - Shape\n2 - Rectangle\n3 - Triangle\n4 - Cancel\n");
    		System.out.print("Which shape would you like to create? : ");
    		choice = scan.nextInt();
    		
    		if (choice == 1) {
    			System.out.print("Enter the color of the shape: ");
    			color = scan.next();
    			
    			Shape newShape = new Shape(color);
    			
    			System.out.println("Color of shape: " + newShape.getColor);
    		}
    		if (choice == 2) {
        		System.out.print("Enter the color of the shape: ");
       			color = scan.next();
       			
       			System.out.print("Enter length: ");
       			int length = scan.nextInt();
       			
       			System.out.print("Enter width: ");
       			int width = scan.nextInt();
       			
       			Rectangle newRectangle = new Rectangle(color, length, width);
       			
       			System.out.println("\nThe color of the rectangle is: " + newRectangle.getColor() 
       							 + "\nThe area of the rectangle is: " + newRectangle.getArea() 
       							 + "\nThe length of the rectangle is: " + newRectangle.getLength() 
       							 + "\nThe width of the rectangle is: " + newRectangle.getWidth());
       				
    		}
    		if (choice == 3) {
    			System.out.println("")
    		}
    			
    		
    	}
    	    	
    }
    
    
}