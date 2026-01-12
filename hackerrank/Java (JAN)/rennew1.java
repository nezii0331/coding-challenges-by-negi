//hackerrank day6 
//divide char with stringbuilder
//debug version

import java.io.*;
import java.util.*;

//AIM: GIVE A STRING S need to print array??of the number?
//this is aim to find the odd number and even number
//so basically yeah we then need to print them out
// separately

public class rennew1 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        // AGAIN
        // I HAVE TO READ THE STRING FIRST OKOK

        Scanner scan = new Scanner(System.in);

        int nextNumber = scan.nextInt();

        for (int i = 0; i < nextNumber; i++) {
            String read = scan.next();
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for (int x = 0; x < read.length(); x++) {
                if (x % 2 == 0) {
                    // even index
                    sb1.append(read.charAt(x));
                } else {
                    // odd index
                    sb2.append(read.charAt(x));
                }
            }
            System.out.println(sb1 + " " + sb2);
        }
        scan.close();
    }
}
