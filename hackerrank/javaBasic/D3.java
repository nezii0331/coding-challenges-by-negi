//Day 3 
// In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:
// Sample Input 0
// 3
// Sample Output 0
// Weird
// Sample Input 1
// 24
// Sample Output 1
// Not Weird
// Explanation

// Sample Case 0: n=3
// n is odd and odd numbers are weird, so we print Weird.

// Sample Case 1: n=24
// n>20 and n is even, so it isn't weird. Thus, we print Not Weird.

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class D3 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // System.out.println("check scanner" +
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"));
        checkN(N);

        scanner.close();
    }

    public static void checkN(int N) {
        while (N <= 100) {
            if (N % 2 == 0) { // this is even
                if (N >= 2 && N <= 5) {
                    System.out.println("Not Weird");
                }
                if (N >= 6 && N <= 20) {
                    System.out.println("Weird");
                }
                if (N > 20) {
                    System.out.println("Not Weird");
                }
            } else {
                System.out.println("Weird");// odd
            }
            N++;
            break;
        }
    }
}
