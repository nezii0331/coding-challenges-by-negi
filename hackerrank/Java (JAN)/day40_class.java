/*
Day 28: RegEx, Patterns, and Intro to Databases

Objective
Today, we're working with regular expressions. Check out the Tutorial tab for learning materials and an instructional video!

Task
Consider a database table, Emails, which has the attributes First Name and Email ID. Given  rows of data simulating the Emails table, print an alphabetically-ordered list of people whose email address ends in .

Input Format
The first line contains an integer, , total number of rows in the table.
Each of the  subsequent lines contains  space-separated strings denoting a person's first name and email ID, respectively.
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

public class day40_class {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ans = new ArrayList<String>();// this is to store firstname of the emailid

        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];

                // System.out.println("1. check :" + firstName + "2. check next : " + emailID);

                // String check = @gmail.com;
                if (emailID.matches(".*@gmail.com")) {
                    ans.add(firstName);
                }

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        Collections.sort(ans);

        for (String name : ans) {
            System.out.println(name);
        }

        bufferedReader.close();
    }
}
