package thirty_days_of_code;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //System.out.println("Enter string: ");
        String S = in.next();
        try{
            Integer integer = Integer.parseInt(S);
            System.out.println(integer);
        }
        catch(NumberFormatException e){
            System.out.println("Bad String");
        }
        in.close();
    }
}
