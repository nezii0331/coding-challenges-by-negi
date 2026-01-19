// leetcode 242
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// HashMap count
// Time O(n)
// Space O(1)
import java.util.HashMap;

public class Solution {
    public boolean isAnagram(String s, String t) {

        // Use a HashMap to count character frequencies
        HashMap<Character, Integer> has = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            has.put(ch, has.getOrDefault(ch, 0) + 1);
        }

        for (int x = 0; x < t.length(); x++) {
            char ch2 = t.charAt(x);

            if (!has.containsKey(ch2)) {
                return false;
            }
            has.put(ch2, has.get(ch2) - 1);

            if (has.get(ch2) < 0) {
                return false;
            }
        }
        return true;
    }
}
