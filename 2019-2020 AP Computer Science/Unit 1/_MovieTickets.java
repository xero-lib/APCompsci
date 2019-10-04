//NAME: Jonathan Kurtz

import java.util.Scanner;


public class _MovieTickets
{
    public static void main(String[] args) 
    {
    	System.out.println("Hello World!\n");
    	
    	final double COSTS_ADULT = 6.00;
    	final double COSTS_CHILD = 3.50;
    	int numAdultTickets = 0, numChildTickets = 0;
    	double totalBill = 0;
    	numAdultTickets = 5;
    	numChildTickets = 1;
    	
    	totalBill = (numAdultTickets*COSTS_ADULT)+(numChildTickets*COSTS_CHILD);
    	System.out.println("Number Adults " + numAdultTickets + "\nNumber Children " + numChildTickets + "\n----------------\nTotal Bill $" + totalBill + "0");
    	
    	
    }
    
    
}