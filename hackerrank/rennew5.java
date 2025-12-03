//Objective
// Today, we are learning about an algorithmic concept called recursion. Check out the Tutorial tab for learning materials and an instructional video.
// Recursive Method for Calculating Factorial
// Function Description
// Complete the factorial function in the editor below. Be sure to use recursion.
// factorial has the following paramter:

// int n: an integer
// Returns

// int: the factorial of 
// Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of .
// Input Format
// A single integer,  (the argument to pass to factorial).
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

class Result {

    /*
     * Complete the 'factorial' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int factorial(int n) {
        // Base case: if n <= 1, return 1.
        // Recursive step: n * factorial(n-1).
        int result = 1;

        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

public class rennew5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n); // Call the factorial method

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
