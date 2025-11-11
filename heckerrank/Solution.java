// Task
// Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).

//Input Format

// The first line contains an integer,  (the number of test cases).
// Each line  of the  subsequent lines contain a string, .

import java.io.*;
import java.util.*;


//AIM: GIVE A STRING S need to print array??of the number?
//this is aim to find the odd number and even number
//so basically yeah we then need to print them out
// separately
  

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        // NewsChar = sacn.nextChar();
        int number = scan.nextInt();
        scan.nextLine();
        
    for(int i = 0; i < number; i++){
        String s = scan.nextLine();
        String result = printEvenString(s);
        
        System.out.println(result);
    }
        
        scan.close();
    }
    
    public static String printEvenString(String s){
        //i might need to turn this into a to charString
        String even = "";
        String odd = "";
        
        for(int i = 0; i< s.length(); i++){
            //check whether can be even
            if( i % 2 == 0){
                even += s.charAt(i);
            } else {
                odd += s.charAt(i);
            }
        }
        return even + " " + odd;
                
    }
    
}