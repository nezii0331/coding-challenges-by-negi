/*
Day 39
This problem is about unit testing.

Your company needs a function that meets the following requirements:

For a given array of  integers, the function returns the index of the element with the minimum value in the array. If there is more than one element with the minimum value, it returns the smallest one.
If an empty array is passed to the function, it raises an exception. A colleague has written this method. The implementation in Python is listed below. Implementations in other languages can be found in the code template.
*/

import java.util.*;

public class day39_class {

    public static int minimum_index(int[] seq) {
        if (seq.length == 0) {
            throw new IllegalArgumentException("Cannot get the minimum value index from an empty sequence");
        }
        int min_idx = 0;
        for (int i = 1; i < seq.length; ++i) {
            if (seq[i] < seq[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
    }

    public static class TestDataEmptyArray {
        public static int[] get_array() {
            // returns an empty array
            int[] ans = new int[0];
            return ans;
        }
    }

    public static class TestDataUniqueValues {

        public static int[] get_array() {
            // returns an array of size at least 2with all unique elements
            // the long should be two and elements unique
            int[] ans = new int[] { 2, 3, 4, 5 };
            return ans;
        }

        public static int get_expected_result() {
            // returns the expected minimum value index for this array
            int index;
            index = 0;
            return index;
        }
    }

    public static class TestDataExactlyTwoDifferentMinimums {

        public static int[] get_array() {
            // returns an array where the minimum value occurs at exactly 2 indices
            // the element that appears twice
            int[] ans = new int[] { 5, 1, 8, 1 };

            return ans;
        }

        public static int get_expected_result() {
            // returns the expected index //{5, 1, 8, 1}
            int result;
            // int count = 0;
            // for(int i = 0 ; i < ans.length; i++){
            // if(ans[i] == ans[i++]){
            // count ++;
            // }
            // }
            // return count;
            result = 1;
            return result;
        }

    }

    public static void TestWithEmptyArray() {
        try {
            int[] seq = TestDataEmptyArray.get_array();
            int result = minimum_index(seq);
        } catch (IllegalArgumentException e) {
            return;
        }
        throw new AssertionError("Exception wasn't thrown as expected");
    }

    public static void TestWithUniqueValues() {
        int[] seq = TestDataUniqueValues.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        Integer[] tmp = new Integer[seq.length];
        for (int i = 0; i < seq.length; ++i) {
            tmp[i] = Integer.valueOf(seq[i]);
        }
        if (!((new LinkedHashSet<Integer>(Arrays.asList(tmp))).size() == seq.length)) {
            throw new AssertionError("not all values are unique");
        }

        int expected_result = TestDataUniqueValues.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void TestWithExactlyTwoDifferentMinimums() {
        int[] seq = TestDataExactlyTwoDifferentMinimums.get_array();
        if (seq.length < 2) {
            throw new AssertionError("less than 2 elements in the array");
        }

        int[] tmp = seq.clone();
        Arrays.sort(tmp);
        if (!(tmp[0] == tmp[1] && (tmp.length == 2 || tmp[1] < tmp[2]))) {
            throw new AssertionError("there are not exactly two minimums in the array");
        }

        int expected_result = TestDataExactlyTwoDifferentMinimums.get_expected_result();
        int result = minimum_index(seq);
        if (result != expected_result) {
            throw new AssertionError("result is different than the expected result");
        }
    }

    public static void main(String[] args) {
        TestWithEmptyArray();
        TestWithUniqueValues();
        TestWithExactlyTwoDifferentMinimums();
        System.out.println("OK");
    }
}
