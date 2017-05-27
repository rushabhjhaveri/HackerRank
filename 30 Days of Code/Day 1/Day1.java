import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Day1 {
	 public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);
	        /* Declare second integer, double, and String variables. */
	           int a = 0;
	           double b = 0;
	           String str = "";

	        /* Read and save an integer, double, and String to your variables.*/
	        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
	        a = scan.nextInt();
	        b = scan.nextDouble();  
	        scan.nextLine();
	        //String s1 = scan.nextLine();
	        str = scan.nextLine();
	        

	        //s = s + str;
	        
	        /* Print the sum of both integer variables on a new line. */
	        System.out.println(i + a);
	        
	        

	        /* Print the sum of the double variables on a new line. */
	        System.out.println(d + b);
	        /* Concatenate and print the String variables on a new line; 
	        	the 's' variable above should be printed first. */
	        System.out.println(s.concat(str));
	        scan.close();
	 }
}
