//  leetcode 454. 4Sum II

public class 09 {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        int res = 0;
        Map<Integer, Integer> checkList = new HashMap<>();

        System.out.println("stage one : loop nums1 and nums2, create HashMap.");

        // initilate the hashmap to put two sums, which first nums will be nums[i] +
        // nums[j]
        // key is present the nums and key to present how much time it appear
        // if this two can be substraction then it will be one tuple
        for (int i : nums1) { // loop first one
            for (int j : nums2) { // loop second
                int sum1 = i + j;
                checkList.put(sum1, checkList.getOrDefault(sum1, 0) + 1);
                System.out.println("current i :" + i + "/current j :" + j + "/sum1 :" + sum1);

                // Boolean isPresent = checkList.containsValue(sum1);
                // System.out.println("isPresent:" + isPresent);
            }
        }

        System.out.println("stage two : loop nums3 and nums4.");
        for (int k : nums3) {
            for (int l : nums4) {
                int sums2 = k + l;
                res += checkList.getOrDefault(-sums2, 0);
                // System.out.println("res:" + res);
                System.out.println("current k :" + k + "/current l :" + l + "/sums2 :" + sums2);
                System.out.println("res :" + res);
            }
        }
        return res;
    }
}