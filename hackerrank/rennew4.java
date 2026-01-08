//hackerrank day08 Dictionaries and Maps

/* Sample Input
 3
 sam 99912222
 tom 11122222
 harry 12299933
 sam
 edward
 harry

/* Sample Output
 sam=99912222
 Not found
 harry=12299933
 */

import java.io.*;
import java.util.*;

public class rennew4 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner scan = new Scanner(System.in);

        // Initialize hashmap
        HashMap<String, Integer> map = new HashMap<>();

        int n = scan.nextInt();

        for (int i = n; i > 0; i--) {
            String name = scan.next();
            Integer phoInteger = scan.nextInt();
            // Add to map
            map.put(name, phoInteger);
        }

        for (; scan.hasNext();) {
            String acorName = scan.next();
            if (map.containsKey(acorName)) {
                System.out.println(acorName + "=" + map.get(acorName));
            } else {
                System.out.println("Not found");
            }
        }
        scan.close();
    }
}