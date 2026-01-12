//Day 5
//Sample Input

//java 100
//cpp 65
//python 50
//Sample Output

//================================
//java           100 
//cpp            065 
//python         050 
//================================

import java.util.*;

public class D5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String label = scan.next();
            int value = scan.nextInt();

            String paddedLabel = padRight(label, 15);
            String paddedValue = padWithZeros(value, 3);

            System.out.println(paddedLabel + paddedValue);
        }

        System.out.println("================================");
        scan.close();
    }

    private static String padRight(String s, int width) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);

        for (int i = s.length(); i < width; i++) {
            sb.append(' ');
        }

        return sb.toString();
    }

    private static String padWithZeros(int n, int width) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < width - s.length(); i++) {
            sb.append('0');
        }

        sb.append(s);
        return sb.toString();
    }
}
