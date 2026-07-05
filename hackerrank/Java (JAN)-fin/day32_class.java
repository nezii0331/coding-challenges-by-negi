// day32_class.java
// Today, we're discussing a simple sorting algorithm called Bubble Sort. Check out the Tutorial tab for learning materials and an instructional video!
// Consider the following version of Bubble Sort:

/*Sample Input 0
3
1 2 3

Sample Output 0

Array is sorted in 0 swaps.
First Element: 1
Last Element: 3
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

public class day32_class {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        // System.out.println("current line: " + n);

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int sum = 0;

        for (int i = 0; i < n; i++) {
            // System.out.println("(1)this where:" + a.get(i));
            int count = 0;

            for (int y = 0; y < n - 1; y++) {
                if (a.get(y) > a.get(y + 1)) {
                    // System.out.println("current range:" + a.get(y));
                    int temp = a.get(y);
                    // System.out.print("(2)current value: a.gey(y): " + a.get(y) + "a.get(y+1): "+
                    // a.get(y+1));
                    a.set(y, a.get(y + 1));
                    a.set(y + 1, temp);
                    count++;
                    // System.out.println("\n" +"(3)count :" + count);
                }
            }
            sum += count;
            // System.out.println("(3)sum :" + sum);
            // System.out.println("all count :"+ count);
            if (count == 0) {
                break;
            }
            // System.out.println("current a : " + a);
        }
        System.out.println("Array is sorted in " + sum + " swaps.");
        System.out.println("First Element: " + a.get(0));
        System.out.println("Last Element: " + a.get(n - 1));
        // Write your code here

        bufferedReader.close();
    }
}
