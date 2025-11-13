//3Sum
// Solved 
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] where nums[i] + nums[j] + nums[k] == 0, and the indices i, j and k are all distinct.

// The output should not contain any duplicate triplets. You may return the output and the triplets in any order.

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]

// Output: [[-1,-1,2],[-1,0,1]]
// Explanation:
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].

// Example 2:

// Input: nums = [0,1,1]

// Output: []
// Explanation: The only possible triplet does not sum up to 0.

// Example 3:

// Input: nums = [0,0,0]

// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.

//aim: three sum 
//i use loop to find the first number and then i will use 
//like for example: use nums[i] + nums[left] + nums[right] =0
//first sort store number then  

public class Solution{
    public List<List<Integer>> threeSum (int [] nums){ //because i wanna return [[0,1,-1][2,-3,1]] etc.
        
        //build good result
        //deal with long < 3
        //sort nums
        List<List<Integer>> result = new ArrayList<>(); //this should be return as the result

        if(nums == null || nums.length < 3 ){
            return result;
        } // need to check the length beforehead 

        Arrays.sort(nums);// first we need to sort and then use two pointer
        //i need to force the first number and then use the other number to add first = 0
        for(int i = 0; i< nums.length - 2; i++){

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i + 1; //cause u will need to give the other two index for
            int right = nums.length -1;

            while(left < right){ //if left < right let them to find the number
                //need to clearfiy sum
                System.out.println("i:"+ i + ",left=" +left + ",right=" + right ); //print index
                int sum = nums[i] + nums[left] + nums[right];
                System.out.println("sum:"+sum );

                    if(sum == 0){ //if already equal to 0 then add into result
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        
                    while(left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    while(left <right && nums[right] == nums[right -1]){
                        right--;
                    }

                    right--;
                    left++;
                } else if(sum < 0){
                    left++;
                } else {  //sum > 0
                    right--;
                }
        System.out.println("result:"+result );
            } 
        }  
        return result;
    }
}