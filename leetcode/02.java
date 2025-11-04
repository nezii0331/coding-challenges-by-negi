/*
 * leetcode 3289. Find the Sneaky Numbers
 * In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1. Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in an additional time, making the list longer than usual.
 * As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing the two numbers (in any order), so peace can return to Digitville.
 */


public class Solution{
    public int[] getSneakyNumbers(int [] nums){
        //create hashset() hashset to check whether repeat
        //list respond for collect repeat 
        //use .add() to check whether there are any repeat
        // if repeat than stop and return
        HashSet<Integer> find = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i< nums.length; i++){
            System.out.println("check nums:" + nums[i]);
            if(!find.add(nums[i])){
                result.add(nums[i]);
                System.out.println("check now:" + result);
                if(result.size() ==2){
                    break;
                }
            }

        }
        return new int [] {result.get(0), result.get(1)};
    }
}