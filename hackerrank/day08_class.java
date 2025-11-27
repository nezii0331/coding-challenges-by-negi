// Objective
// Today, we will learn about the Array data structure. Check out the Tutorial tab for learning materials and an instructional video.

// Task
// Given an array, , of  integers, print 's elements in reverse order as a single line of space-separated numbers.

// Example
// Print 4 3 2 1. Each integer is separated by one space.

// Input Format

// The first line contains an integer,  (the size of our array).
// The second line contains  space-separated integers that describe array 's elements.
// Constraints

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

// Read the size of the array, then read the array elements, and finally print them in reverse order.
// Print the elements of array A in reverse order as a single line of space-separated numbers.

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        // int [] a = new int [n];
        // System.out.println(n);
        // System.out.println(a);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        printReverse(n, arr);
        System.out.println(arr.stream().map(String::valueOf)
                .collect(Collectors.joining(" ")));

        bufferedReader.close();
    }

    public static void printReverse(int n, List<Integer> arr) {

        int left = 0;
        int right = n - 1; // Initialize right pointer

        while (left < right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            // System.out.println("==right==" + arr); // Debug: Print array after swapping
            arr.set(right, temp);
            // System.out.println("==left==" + arr); // Debug: Print array after swapping
            right--;
            left++;
        }
    }

}
