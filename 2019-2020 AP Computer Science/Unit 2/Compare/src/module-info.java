//NAME:  Ms. Griffin

import java.util.Scanner;

public class StringCompareTo
{
    public static void main(String[] args) 
    {
    
    /*
     * The String method compareTo compares two strings based on the Unicode value of each character.
     * This comparison method is called comparing lexographically.
     * The output of the method is an integer value (not a string).
     */ 
    
    
    /*
     *  Run the following program and complete the comments to be your notes.
     */
    
    
    System.out.print("Golbat compared to Metapod:  ");
    System.out.println("Golbat".compareTo("Metapod"));
    System.out.println();
    // The output is the number ____. This is a negative number.
    // This is because Golbat comes _______ Metapod in the alphabet.
    // G   H   I   J   K   L   M 
    // -6  -5  -4  -3  -2  -1  0
    // What is the significance of the output? _____
    
    
    
    System.out.print("Pikachu compared to Metapod:  ");
    System.out.println("Pikachu".compareTo("Metapod"));
    System.out.println();
    // The output is the number ____. This is a _________ number.
    // This is because Pikachu comes _______ Metapod in the alphabet.
    // M  N  O  P 
    // 0  1  2  3
    // What is the significance of the output? ______
    
    
    
    System.out.print("Pikachu compared to Pikachu:  ");
    System.out.println("Pikachu".compareTo("Pikachu"));
    System.out.println();
    // The output is the number ____. 
    // This is because Pikachu and Pikachu are identical strings (including capitalization).
    // What is the significance of the output?
    
    
    
    /*
     *
     * Now see what happens if some of the letters are the same.
     *
     */
    
    
    
    System.out.print("Sandshrew compared to Squirtle:  ");
    System.out.println("Sandshrew".compareTo("Squirtle"));
    System.out.println();
    // The output is the number ____. This is a negative number.
    // This is because Sandshrew comes ______ Squirtle in the alphabet.
    // a   b   c   d   e   f    g   h   i   j   k    l    m    n    o   p    q       
    // -16 -15 -14 -13 -12 -11  -10 -9  -8  -7  -6   -5   -4   -3   -2  -1   0
    // What is the significance of the output? ______  
    
    
    System.out.print("Sandslash compared to Sandshrew:  ");
    System.out.println("Sandslash".compareTo("Sandshrew"));
    System.out.println();
    // The output is the number ____. This is a ____ number.
    // This is because Sandslash comes ______ Sandshrew in the alphabet.
    // h   i   j   k   l       
    // 0   1   2   3   4
    // What is the significance of the output? ______
    
    
    /*
     *
     * Now see what happens if the letters match for the length of one word.
     *
     */
    
    
    System.out.print("Paras compared to Parasect:  ");
    System.out.println("Paras".compareTo("Parasect"));
    System.out.println();
    // The output is the number ____. This is a ____ number.
   
    System.out.print("Parasect compared to Paras:  ");
    System.out.println("Parasect".compareTo("Paras"));
    // The output is the number ____. This is a ____ number.
    
    // What is the significance of the output? ______
    	    	
    }
    
    
}