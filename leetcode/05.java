//2451. Odd String Difference

//You are given an array of equal-length strings words. Assume that the length of each string is n.
// Each string words[i] can be converted into a difference integer array difference[i] of length n - 1 where difference[i][j] = words[i][j+1] - words[i][j] where 0 <= j <= n - 2. Note that the difference between two letters is the difference between their positions in the alphabet i.e. the position of 'a' is 0, 'b' is 1, and 'z' is 25.
// For example, for the string "acb", the difference integer array is [2 - 0, 1 - 2] = [2, -1].
// All the strings in words have the same difference integer array, except one. You should find that string.
// Return the string in words that has different difference integer array.

import java.util.Arrays;

public class Solution{
// i use two methos 
//first i need to create the first method to let the string of the words turning into new string [length 2]

    public String oddString(String[] words){

        String [] difference = new String[words.length];
        System.out.println("difference length: " + difference.length);
        //所以要先轉型別 先把string 變成char
        for(int i = 0; i < words.length; i++){
            // System.out.println("words length: " + words[i]);
            String currentWord = words[i];
            // System.out.println("currentWord: " + currentWord);
            int[] diffArray = new int [currentWord.length()-1];

            for(int x = 0; x < currentWord.length() - 1 ;x++){  //如果這邊條件寫x < words.length 為甚麼會out of bundary,
            //因為currentword比word.length 小嗎?
            char char1 = currentWord.charAt(x);
            char char2 = currentWord.charAt(x+1);

            int diff = char2 - char1;
            // System.out.println("diff is: " + char1 + "-" +  char2);

            diffArray[x] = diff;
            // System.out.println("diffArray :" + diffArray[x] );
            }
            difference[i] = Arrays.toString(diffArray);
        }
        System.out.println("difference :" + Arrays.toString(difference) );

            String one = difference[0];
            String two = difference[1];
            String three = difference[2];

            String normal;

            System.out.println("first1 :" + one + " 2: " + two + " 3:" + three);

            if (one.equals(two)) {
                normal = one;
            } else if (one.equals(three)) {
                return words[1];
            } else {
                return words[0];
            }

            for (int i = 2; i < words.length; i++) {
                if (!difference[i].equals(normal)) {
                    return words[i];
                }
            }
    
    return "";
    }


}