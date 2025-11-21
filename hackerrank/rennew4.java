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

    public static void main(String[] args){ 
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    
    
    Scanner scan = new Scanner(System.in);
    
    //initilate hasmap
    HashMap <String , Integer>  map = new HashMap<>();
    //hashmap <key, value>
    
    int n = scan.nextInt();
    // System.out.println("print int :" + n);
    
    
    //initialize debug
    // System.out.println("print name :" + name);
    // System.out.println("print pho :" + phoInteger);
    
    for(int i = n; i > 0 ; i--){
        String name = scan.next();
        Integer phoInteger =scan.nextInt();    
        //according to the input put into map
        map.put(name, phoInteger);
        // System.out.println("current i :" + i);
        // System.out.println("current map :" + map);
    }

    
    for( ;scan.hasNext(); ){ //you must continue reading lines until there is no more input.
        String acorName = scan.next();
        // System.out.println("print name :" + acorName);
        if(map.containsKey(acorName)){
            System.out.println( acorName + "=" + map.get(acorName)); 
        } else {
            System.out.println("Not found");
        }
    }
    }
}