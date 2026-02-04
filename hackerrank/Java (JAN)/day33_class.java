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
