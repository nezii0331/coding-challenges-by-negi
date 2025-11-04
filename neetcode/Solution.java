// 128. Longest Consecutive Sequence

// input array nums return lenght if the lonest
// every data only read once like o(n) 
// this is means only one loop?

public class Solution{
    public int longestConsecutive(int [] nums){

        //first i need to loop and sort this and then output the consecutive sequence
        HashSet<Integer> initial = new HashSet<>(); //for initial array

        for(int i = 0; i< nums.length ; i++ ){ //iterate
        //check if this is the start of sequence
            initial.add(nums[i]);
        }
        int longest = 0 ;   //track the longest numbers

        for(int n : initial){ //to iterate
             System.out.println("Start at " + n);
            if (!initial.contains(n-1)){ // in set; 
              int length = 0;//tracking
                while(initial.contains(n+ length)){  // HERE TO CHECK WHETHER IT ALREADY CONTAINS NEXT VALUE
                System.out.println("  found " + (n + length));
                 System.out.println("  THE LENGTH " + length);
                length ++;
              }
                longest = Math.max(length, longest);
            }
        }
        System.out.println("Longest length = " + longest);
        return longest;
    }
}