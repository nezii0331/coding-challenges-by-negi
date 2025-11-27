// Problem: Product of Array Except Self

public class solution {
    public int[] productExceptSelf(int[] nums) {
        // Step 1: Initialize result array
        int[] result = new int[nums.length];

        // Nested loop approach (O(n^2)) - Note: This is less efficient than the O(n)
        // prefix/postfix approach.
        for (int i = 0; i < nums.length; i++) {
            int total = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
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
