//Leetcode 680 Valid Palindrome II
//AIM: to find palindrome and whether we need to delete or not

//Aim: if s can be palindrome after deleting at most one character

public class Solution{
    public boolean validPalindrome(String s){
        
        StringBuilder sb = new StringBuilder(s);

        //this time i don't need to clean them 
        // i only need to let me think 
        //i need to use two pointer as well
        //first check whether there are the only one char then try delete it and then reverse to check this can be palindrome


        int left = 0 ;
        int right = sb.length()-1;
        
        while(left < right){
            if(sb.charAt(left) == sb.charAt(right)){
                left ++;
                right --;
            }else{
                System.out.println("current left :" + sb.charAt(left));
                System.out.println("current right :"+ sb.charAt(right));
                return helpMethods(sb, left)|| helpMethods(sb, right);
                //call hewlper function to help me delete
            }
        }
        return true;
    }


    public boolean helpMethods(StringBuilder sb, int index){
            StringBuilder newSb = new StringBuilder(sb);
            System.out.println("==current sb== : " + sb);
            newSb.deleteCharAt(index);
            System.out.println("==new sb== : " + newSb);
            return isPalindrome(newSb);
    }



    public boolean isPalindrome(StringBuilder sb){//check whether is paindrom
        int left = 0;
        int right = sb.length()-1;

        while(left < right) {
            if(sb.charAt(left) != sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
    return true;
    }
}

