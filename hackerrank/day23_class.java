//String Spilt
//Try myself

import java.io.*;
import java.util.*;

public class day23_class {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named day23_class.
         */
        Scanner scan = new Scanner(System.in);
        int howMany = scan.nextInt();
        int howMany = scan.nextInt();

        String first = scan.next();
        String first = scan.next();

        String second = scan.next();
        String second = scan.next();

        spilEvenString(first, second);
        spilEvenString(first, second);
        System.out.print("\n" + spilEvenString(first, second));

        spilOddString(first, second);
        spilOddString(first, second);
        System.out.print("\n" + spilOddString(first, second));
    }

    public static StringBuilder spilEvenString(String first, String second) {

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {
            if (i % 2 == 0) {
                // even
                newString.append(first.charAt(i));
            }
        }

        for (int i = 0; i < second.length(); i++) {
            if (i % 2 == 0) {
                // even
                newString.append(second.charAt(i));
            }
        }

        return newString;
    }

    public static StringBuilder spilOddString(String first, String second) {

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {
            if (i % 2 != 0) {
                // odd
                newString.append(first.charAt(i));
            }
        }

        for (int i = 0; i < second.length(); i++) {
            if (i % 2 != 0) {
                // odd
                newString.append(second.charAt(i));
            }
        }

        return newString;
    }

}
