/*
Sample Input
3
12
5
7

Sample Output
Not prime
Prime
Prime
*/

//method1

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class day37_class {

    public static void main(String[] args) {
        /* Enter your code here. */
    Scanner scan = new Scanner(System.in);
    int T = scan.nextInt();
    // System.out.println("current number :" + T);
    
    for(int i =0; i< T; i++){
        int ans = scan.nextInt();
        // System.out.println("the number appending :" + ans);
        //if ans could be divid by one and itself then should be prime
        int other;
        int check = ans;
        int count = 0;
        while(check > 0){
            other = ans % check;
            if(ans % check == 0){
                // System.out.println("other" +other );
            count ++;
            }
            
        check --;
        }
            if(count == 2){
                System.out.println("Prime" );
            }else{
                System.out.println("Not prime" );
            }
            
        }
    }
}

// method2
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        // System.out.println("current number :" + T);

        for (int i = 0; i < T; i++) {
            int ans = scan.nextInt();
            if (ans <= 1) {
                System.out.println("Not prime");
            } else {
                // System.out.println("the number appending :" + ans);
                // if ans could be divid by one and itself then should be prime
                int other;
                int check = 2;
                boolean isPrime = true;
                while (check <= Math.sqrt(ans)) {
                    other = ans % check;
                    if (ans % check == 0) {
                        isPrime = false;
                        break;
                    }
                    check++;
                }
                if (isPrime == true) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not prime");
                }

            }
        }
    }
}
