// Input Format
// A single integer, n.

// Output Format

// Print  lines of output; each line i contains the result of n*1 in the form:
// n x i = result.

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

public class day06_class{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        
        int i = 1;
        while(i < 11 ){
            int result = n * i;
            System.out.println( n + " x " + i + " = " + result);
            i++;
        }
        
        bufferedReader.close();
    }
}
