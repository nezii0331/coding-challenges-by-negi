/*
 * HackerRank 30 Days of Code
 * Day 03: Class
 * 
*/

/*
*Given an integer, , perform the following conditional actions:
*
*If  is odd, print Weird
*If  is even and in the inclusive range of  to , print Not Weird
*If  is even and in the inclusive range of  to , print Weird
*If  is even and greater than , print Not Weird
*Complete the stub code provided in your editor to print whether or not  is weird.
* 
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class day03_class {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        

        bufferedReader.close();
        
        checkOddOrEven(N);
    }

// public class Soulution {
    public static void checkOddOrEven(int n ){
    //only read the N and check the logic 
    //if this n can't be difference by 2 then it should be weird
    if( n % 2 != 0){
        System.out.println("Weird");  //odd
    } else {
        checkEven(n);  //even
        // System.out.println("checkN:" + n);
    }
    
    }
    
    public static void checkEven(int n){
        if(n >= 2 && n <= 5){
            System.out.println("Not Weird");
        } else if( n >= 6 && n <= 20){
            System.out.println("Weird");            
        } else if (n > 20) {
            System.out.println("Not Weird");
        }
        
    }

}

// }
