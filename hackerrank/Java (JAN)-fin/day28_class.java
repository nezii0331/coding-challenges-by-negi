// The challenge here is to read n lines of input until you reach EOF, then number and print all n lines of content.
// Hint: Java's Scanner.hasNext() method is helpful for this problem.

import java.io.*; //this is for system.input
import java.util.*; //this is for library?

public class day28_class {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        /*
         * //1. method one
         * Scanner scan = new Scanner(System.in);
         * int n = 40000;
         * int c = 1;
         * 
         * for(int i = 0 ; i < n; i++){
         * if(scan.hasNext() == false){
         * break;
         * }
         * String read = scan.nextLine();
         * System.out.println( c + " "+ read);
         * c++;
         * }
         */

        // 2. method two
        Scanner scan = new Scanner(System.in);
        int c = 1;

        while (scan.hasNext() != false) {
            String read = scan.nextLine();
            System.out.println(c + " " + read);
            c++;
        }
    }
}
