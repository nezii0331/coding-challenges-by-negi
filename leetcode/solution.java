// 238. Products of Array Except Self

// Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.

public class solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        // First pass: Calculate prefix products
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        // Second pass: Calculate postfix products and multiply with prefix
        int postfix = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            result[j] *= postfix;
            postfix *= nums[j];
        }

        return result;
    }
}