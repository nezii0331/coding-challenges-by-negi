// aim: product of array
// to give the products of   

public class solution{
    public int[] productExceptSelf(int[] nums){
        //step 1:loop nums and then let others plus
       int [] result = new int[nums.length];
       
       //even if this is index[0] == 1
        for(int i = 0; i<nums.length; i++){
            int total = 1;   
            for(int j = 0; j<nums.length; j++){
                if(j == i){
                    continue;
                }
                total *= nums[j];
                System.out.println("==current==" + nums[j]);
                }
            result[i] = total;
            }
        return result;
    }
}
    