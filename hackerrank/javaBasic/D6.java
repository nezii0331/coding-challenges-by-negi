//Day 6

/* 
N x i = result.

Sample Input
2

Sample Output
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
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

public class D6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        // method 1
        int i = 0;
        int result = 0;

        for (i = 1; i <= 10; i++) {
            result = N * i;

            System.out.println(N + " x " + i + " = " + result);
        }

        /*
         * method 2
         * int i = 1;
         * int result = 0;
         * 
         * while(i < 11){
         * result = N * i;
         * 
         * System.out.println( N + " x " + i + " = "+ result );
         * i++;
         * }
         */

        /*
         * method 3
         * int i = 10;
         * int result = 0 ;
         * for( ; i > 0; i--){
         * result = N * i;
         * 
         * System.out.println( N + " x " + i + " = "+ result );
         * }
         */

        /*
         * method 4
         * int i = 10;
         * int result = 0;
         * 
         * while(i > 0){
         * result = N * i;
         * 
         * System.out.println( N + " x " + i + " = "+ result );
         * i--;
         * }
         */

        bufferedReader.close();
    }
}
