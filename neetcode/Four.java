 //Neetcode 150 Valid Palindrome
// Solved 
// Given a string s, return true if it is a palindrome, otherwise return false.

// A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

// Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

public class Solution{
    public boolean isPalindrome(String s){
        StringBuilder clean = new StringBuilder();

        //pesudocode
        for (char c : s.toCharArray()){  // turn string s into characterarray
            if(Character.isLetterOrDigit(c)){//ignore blanck point etc.
              clean.append(Character.toLowerCase(c));  //add number into and with turn into lowercharacter
              System.out.println("character:" + clean);  
            }
        }

        int right = clean.length() - 1; //hope iterate from the last
        int left = 0;  //hope iterate from the beginning 

        while(left < right){  //after iterate again
                System.out.println("left :" + clean.charAt(left));
                System.out.println("right :"+ clean.charAt(right));
            //i need to move the pointer
            if (clean.charAt(left) != clean.charAt(right)){ 
            return false;//if the number is different return false
            }
            left++;
            right --;
        }
        return true;  //if their number is the same than return true
    }
}


