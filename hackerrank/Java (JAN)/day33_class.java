// Objective
//day21:generics
// Today we're discussing Generics; be aware that not all languages support this construct, so fewer languages are enabled for this challenge. Check out the Tutorial tab for learning materials and an instructional video!

import java.io.*;
import java.util.*;

public class day33_class {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        HashSet<String> finals = new LinkedHashSet<>();
        // LinkedHashSet is used to store the values in the order they are inserted
        // HashSet is used to store the values in the order they are inserted

        while (scan.hasNextInt()) {
            int count = scan.nextInt();

            for (int i = 0; i < count; i++) {
                finals.add(scan.next());
                // System.out.println("current f:" + finals);
            }
        }
        for (String each : finals) {
            System.out.println(each);
        }

        scan.close();
    }

    public int[] printArray(int[] array) {

        int[] ans = new int[10];

        System.out.println("current ans:" + ans);
        return ans;
    }
}

// METHOD FINAL
import java.util.*;

class Printer<T> {

    /**
     * Method Name: printArray
     * Print each element of the generic array on a new line. Do not return
     * anything.
     * 
     * @param A generic array
     **/

    // Write your code here
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

}

public class day33_class {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }

        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        if (Printer.class.getDeclaredMethods().length > 1) {
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    }
}