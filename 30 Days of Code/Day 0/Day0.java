import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Day0 {
	public static void main(String[] args) {
        // Create a Scanner object to read input from stdin.
		Scanner scan = new Scanner(System.in); 
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 

		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
      
		// Print a string literal saying "Hello, World." to stdout.
		System.out.println("Hello, World.");
      
	    // TODO: Write a line of code here that prints the contents of inputString to stdout.
        System.out.println(inputString);
        
        System.out.println(( 6-9 > ~1? (9-6)<=9?3:4: 5));
        
        double m = 3.2;
        double n = 2.3;
        if(!(!((m==n)?(m>n+1)?true:false:false))){
        	System.out.println(m);
        }
        else{
        	System.out.println(n);
        }
	}
}
