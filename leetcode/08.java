import java.util.*;

public class 08 {
    public int[] intersection(int[] nums1, int[] nums2) {
        // so for this problem we have to find the same element in two array
        List<Integer> ans = new ArrayList<>();
        Set<Integer> check = new HashSet<Integer>();

        for (int i : nums1) {
            check.add(i);
        }

        for (int y : nums2) {
            if (check.contains(y)) {
                if (!ans.contains(y)) {
                    ans.add(y);
                }
            }
        }
        int[] finalAns = new int[ans.size()];
        for (int o = 0; o < ans.size(); o++) {
            System.out.println("cuurent value:" + ans.get(o));
            finalAns[o] = ans.get(o);
        }
        return finalAns;
    }
}