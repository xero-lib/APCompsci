//NAME: Jonathan Kurtz

import java.util.Scanner;


public class _EnergyNeeded
{
    public static void main(String[] args) 
    {
    	System.out.println("Hello World!\n");
    	
    	
    	double amountOfWater = 0, initialTempCelsius = 0, finalTempCelsius = 0, energyNeeded = 0;
    	amountOfWater = 55.00;
    	initialTempCelsius = 3.50;
    	finalTempCelsius = 10.50;
    	energyNeeded = amountOfWater*(finalTempCelsius - initialTempCelsius)*4184.00;
    	System.out.println("The energy needed is " + energyNeeded + "0 joules.");
    	
    }
    
    
}