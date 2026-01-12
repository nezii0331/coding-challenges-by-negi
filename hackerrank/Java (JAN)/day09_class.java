//HackerRank day-08 
//Task
// Given  names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each  queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for  is not found, print Not found instead.
// Explanation

// We add the following  (Key,Value) pairs to our map so it looks like this:
// We then process each query and print key=value if the queried  is found in the map; otherwise, we print Not found.
import java.io.*;
import java.util.*;

public class day09_class {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //initilate the number and hashmap
    
        Scanner scan = new Scanner(System.in);
        //first we read the integer of n 
        //then the phone number
        //according to n we will have n number of phonenumbers 
        //then we store into hashmap 
        //then depend on the user input we need to find the excetlly same name and then print
        int n = scan.nextInt();
        HashMap <String, Integer> phoneNumber = new HashMap(); 

        for(int i = 0 ; i < n; i++){   //according to n we will have n number of phonenumbers 
            String name = scan.next();
            Integer phone = scan.nextInt();
            phoneNumber.put(name, phone);   // i put the string into this hash map;
        }
        
        while(scan.hasNext()){ //read the name and then check whether there still got another n ((check token))
            String inputName = scan.next();
            // for(int x= 0 ; x < phoneNumber.size(); x++ ){
                if(phoneNumber.containsKey(inputName)){
                    System.out.println(inputName+ "=" + phoneNumber.get(inputName));
                }else{
                    System.out.println("Not found");
                }
            }
        // }
    }
}
