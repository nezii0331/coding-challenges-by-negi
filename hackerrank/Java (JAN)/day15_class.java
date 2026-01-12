//Day   
// You are given  queries in the form of ,a ,b and n. For each query, print the series corresponding to the given a ,b and n values as a single line of  space-separated integers.
/* 
Sample Input
2
0 2 10
5 3 5

Sample Output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/

import java.util.*;
import java.io.*;

class day15_class {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            // System.out.println("a: " +a+" b: "+b+" n: "+ n);

            // need to caculate the number of two?
            // if its odd or even
            // for even we need to use 2's complement
            // for odd we need to use
            List<Integer> res;

            // if(a <= 0){
            // res = calcualteZero(a, b, n);
            // } else {
            // // System.out.println();
            res = calculateTrue(a, b, n);
            // System.out.println();
            // }

            System.out.println(listToString(res));
        }
        in.close();
    }

    public static String listToString(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1)
                sb.append(" ");
        }
        return sb.toString();
    }

    public static List<Integer> calculateTrue(int a, int b, int n) {
        List<Integer> ans = new ArrayList<>();
        int count = 0;
        int two = 1;
        int temp = 0;
        int s = 0;
        int sum = a + 1 * b;
        // System.out.println("== first one not seem sum: " + sum);
        ans.add(sum);
        for (; count < n - 1; count++) {
            two *= 2;
            // System.out.println("two: " + two);
            temp = two * b;
            // System.out.println("temp: " + temp);
            // s += temp; //every time add // s = 6, 18, 42, 90
            // System.out.println("s: " + s);
            sum += temp; // directly add sum and temp each
            // System.out.println("sum: " + sum);
            ans.add(sum);
        }
        // System.out.println("ans: " + ans);

        return ans;

    }

    // public static List<Integer> calcualteZero(int a , int b , int n ){
    // List <Integer> ans = new ArrayList<>();
    // int count = 0 ;
    // int sum = 0 ;
    // a = a + 1;
    // while(count < n ){
    // sum += a;
    // // System.out.println("3. sum : " + sum);
    // sum *= b;
    // // System.out.println("How's zero now:" + sum);
    // count ++;
    // ans.add(sum);
    // }

    // return ans;
    // }
}
