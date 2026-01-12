//hackerrank
//Input Format

// A single integer, .

// Constraints

// Output Format

// Print a single base-10 integer that denotes the maximum number of consecutive 1's in the binary representation of n.

// Sample Input 1

// 5
// Sample Output 1

// 1
// Sample Input 2

// 13
// Sample Output 2

// 2

import java.io.*;

public class day13_class {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int count = 0;
        int maxCount = 0;

        int fackBin = 1;

        // Find the highest power of 2 less than or equal to n
        while (fackBin <= n) {
            fackBin *= 2;
        }
        fackBin /= 2;

        // Scan bits from most significant to least significant
        while (fackBin > 0) {
            if (n >= fackBin) {
                n -= fackBin;
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
            fackBin /= 2;
        }

        System.out.println(maxCount);
    }
}
