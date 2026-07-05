//Today, we're getting started with Exceptions by learning how to parse an integer from a string and print a custom error message. Check out the Tutorial tab for learning materials and an instructional video!

//Sample Input 0
//3
//Sample Output 0
//3

//Sample Input 1
//za
//Sample Output 1
//Bad String

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

public class day27_class {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        try {
            int value = Integer.parseInt(S);
            System.out.println(value);
        } catch (Exception e) {
            System.out.println("Bad String");
        }

        bufferedReader.close();
    }
}
