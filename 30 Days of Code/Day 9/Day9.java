import java.util.*;
public class Day9 {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }
    public static int factorial(int n){
        if(n ==1 || n == 0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        } 
    }
}
