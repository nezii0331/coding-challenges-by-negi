// Day 14: Class
// Objective
// Today, we are building on our knowledge of arrays by adding another dimension. Check out the Tutorial tab for learning materials and an instructional video.

// Context
// Given a 6 x 6 2D Array, A

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



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        // System.out.println("current arr:" + arr);
        
        int MaxSum = Integer.MIN_VALUE;
        
        for(int i = 0; i<=3 ; i++ ){
            for(int j = 0 ; j<=3; j++){
                //here we need to calcuate those seven number
                // System.out.println("print at (" + i + " j "+ j +")");
                
                // System.out.println("current arr:" + arr.get(i).get(j)); //run throuth [11100]
                int sum = 0;
                
                sum += arr.get(i).get(j);
                sum += arr.get(i).get(j+1);
                sum += arr.get(i).get(j+2);
                sum += arr.get(i+1).get(j+1);
                sum += arr.get(i+2).get(j);
                sum += arr.get(i+2).get(j+1);
                sum += arr.get(i+2).get(j+2);
                // System.out.println("2. current arr:" + arr.get(i+2).get(j+2));
                
                // System.out.println("crrent sum = " + sum);
                
                MaxSum = Math.max(sum, MaxSum);
                // System.out.println("crrent MaxSum = " + MaxSum);
                
            }
        }
        System.out.println(MaxSum);
    

        bufferedReader.close();
    }
}
