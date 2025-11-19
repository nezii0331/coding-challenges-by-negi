/* /
 *HackerRank 30 Days of Code
 *Day 04: Class
 *Task
 *A random variable, , follows Poisson distribution with mean of . Find the probability with which the random variable  is equal to .
 */



 import java.io.*;
import java.util.*;

public class day04_class {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner (System.in);
        double lambda = scan.nextDouble(); 
        int k = scan.nextInt();
        
        double result =Math.pow(lambda, k)*Math.exp(-lambda)/factorial(k); 
        
        System.out.printf("%.3f", result);
        scan.close();
        
    }
    
    public static double factorial(int n){
        double result = 1.0; //to control the loop
        for(int i = 1 ; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
