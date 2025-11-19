//hackerrank day 7 
//Array reverse with stringbuilder
//debug version

//Sample Input
// /* 
// 4
// 1 4 3 2
// Sample Output

// 2 3 4 1
// * //

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class rennew3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
            
            
        }
        // System.out.println("arr:" + arr);
             //to reverse arr
            StringBuffer newItem = new StringBuffer();
            for(int x = n-1; x >= 0; x--){
                // System.out.println(" x " + arr.get(x));
                newItem.append(arr.get(x));
                newItem.append(" ");
                // newItem = x;
            }
            System.out.println(newItem);
    

        bufferedReader.close();
    }
}
