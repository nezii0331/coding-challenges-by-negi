// Objective
// Today we're discussing scope. Check out the Tutorial tab for learning materials and an instructional video!

// Sample Input

// STDIN   Function
// -----   --------
// 3       __elements[] size N = 3
// 1 2 5   __elements = [1, 2, 5]
// Sample Output

// 4

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // constructor //here is the born evidence
    // constructor: initialize the object with the input array
    Difference(int[] elements) {
        this.elements = elements;
    }

    // Add your code here
    public void computeDifference() { // elements is the private so that you can use it inside this class no need to
                                      // call
        // elements is a private instance variable, so it can be accessed directly
        // inside this class
        int Max = elements[0]; // need an actucal value
        int Min = elements[0]; // array is guaranteed to have at least one element

        for (int i = 1; i < elements.length; i++) {
            if (Max < elements[i]) {
                Max = elements[i];
            }
            if (Min > elements[i]) {
                Min = elements[i];
            }
            // to debug
            // System.out.println("Max = " + Max);
            // System.out.println("Min = " + Min);
        }

        maximumDifference = Max - Min;
    }

} // End of Difference class

public class day25_class {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}