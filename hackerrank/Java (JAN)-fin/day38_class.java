/* 
Objective
Nested Logic

Today's challenge puts your understanding of nested conditional statements to the test. You already have the knowledge to complete this challenge, but check out the Tutorial tab for a video on testing.

Task
Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

Sample Input
STDIN       Function
-----       --------
9 6 2015    day = 9, month = 6, year = 2015 (date returned)
6 6 2015    day = 6, month = 6, year = 2015 (date due)

Sample Output
45
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day38_class {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int scanDate = scan.nextInt();
        int scanMonth = scan.nextInt();
        int scanYear = scan.nextInt();
        // System.out.println("check date:" + scanDate);
        // System.out.println("check month:" + scanMonth);
        // System.out.println("check year:" + scanYear);

        int returnDate = scan.nextInt();
        int returnMonth = scan.nextInt();
        int returnYear = scan.nextInt();
        // System.out.println("check date:" + returnDate);
        // System.out.println("check month:" + returnMonth);
        // System.out.println("check year:" + returnYear);

        // here should check
        // if year if month if date

        int fee = 0;

        // first remove the less situation?
        if (scanYear < returnYear) {
            // System.out.println(fee); //this should be 0
        } else if (scanYear > returnYear) {
            fee = 10000;
            // System.out.println(fee);
        } else { // (scanYear == returnYear)
            if (scanMonth > returnMonth) {
                fee = checkMonth(scanMonth, returnMonth) * 500;
            } else if (scanMonth == returnMonth) {
                fee = checkDate(scanDate, returnDate) * 15;
            }
        }
        System.out.println(fee);
    }

    // for(int i : 3043){
    // int returnDate = scan.nextInt();
    // }

    // System.out.println("check out:" + returnDate);
    // }
    // }

    // i will write a method to let check the range anyway
    public static int checkDate(int scanDate, int returnDate) {
        int res = 0;

        if (scanDate > returnDate) {
            res = scanDate - returnDate;
        }
        return res;
    }

    public static int checkMonth(int scanMonth, int returnMonth) {
        int res = 0;
        res = scanMonth - returnMonth;
        return res;
    }

    // public static int checkYear(int scanYear, int returnYear){
    // int res = 0;

    // if(scanYear > returnYear){
    // res = returnYear - scanYear;
    // }
    // return res;
    // }
}
