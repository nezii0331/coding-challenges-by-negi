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