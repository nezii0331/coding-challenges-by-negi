// 15. 3Sum
// brute force

// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.

public class Solution{
    public ArrayList threeSum(int [] nums){
        //later add ArrayList;
        ArrayList<List<Integer>> result = new ArrayList<>();

        // one number to adding with other two
        for(int i = 0 ; i< nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    if(nums[i] + nums [j] +nums[k]==0 && i != j && i!=k && j!=k){
                    // System.out.println("nums[i]:"+nums[i]+"/nums[j]:"+nums[j] +"/nums[k]:"+ nums[k]);
                    List<Integer> triple = Arrays.asList(nums[i],nums[j], nums[k]);
                    Collections.sort(triple); 
                    // System.out.println("this is "+ triple);
                    if(!result.contains(triple)){
                        result.add(triple);  //should know this assume result have contain those three numbers 
                    }
                    // System.out.println("index:i="+i+"index:j="+j +"index:k="+k);
                    }
                }
            }
        }
        return result;
    }
}