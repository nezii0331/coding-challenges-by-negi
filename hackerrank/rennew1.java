//hackerrank day6 
//divide char with stringbuilder
//debug version


import java.io.*;
import java.util.*;


//AIM: GIVE A STRING S need to print array??of the number?
//this is aim to find the odd number and even number
//so basically yeah we then need to print them out
// separately
  

public class rennew1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    //AGAIN
    //I HAVE TO READ THE STRING FIRST OKOK
    
    
    Scanner scan = new Scanner(System.in);
    
    //READ THE NUMBER FIRST 
    int nextNumber = scan.nextInt();
    // System.out.println("How many line there are : " + nextNumber);
    //ok i read the number
    
    
    for(int i = 0 ; i < nextNumber; i++){
        // System.out.println("2. line now : " + i);
        //according to this number i have to read the string into new stringbuilder
        String read = scan.next();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        // System.out.println("read next string:" + read );
        //ok i have read according to the string 
        //then i need to appand with this into the result sb1 sb2
            for(int x =0; x< read.length(); x++ ){   
                // System.out.println("length:" + read.charAt(x)); //currentlly yes this is right
                //then to check the odd and even 
                if(x % 2 == 0){
                    //if this is odd
                    sb1 = sb1.append(read.charAt(x));
                    // System.out.println("sb1:" + sb1);
                }else{
                    sb2 = sb2.append(read.charAt(x));
                    // System.out.println("sb2:" + sb2);
                    //i have to divid this 
                }
            }
            System.out.println( sb1 + " " + sb2);
        }
    }
}
