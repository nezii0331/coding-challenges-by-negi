// Neetcode 271. Encode and Decode Strings
// AIM: Encode a list of strings into one single string,
//      then decode it back to the original list of strings.

public class Solution {

    // Encode: Convert a list of strings into a single string
    public String encode(List<String> en) {
        StringBuilder sb = new StringBuilder(); // Used to build the entire string efficiently

        for (int i = 0; i < en.size(); i++) {
            // Create a new variable for the current word
            // and an integer to calculate its length
            String word = en.get(i);
            int len = word.length();

            // Append: [length]#[word]
            sb.append(len).append('#').append(word);
        }

        // Convert StringBuilder back to a String
        return sb.toString();
    }

    // Decode: Convert a single encoded string back into a list of strings
    public List<String> decode(String de) {
        // Initialize a new list to store decoded strings
        List<String> li = new ArrayList<>();

        int i = 0;
        while (i < de.length()) {
            // Use an inner loop to find the position of '#'
            int j = i;
            while (de.charAt(j) != '#') {
                j++;  // Keep moving forward until '#' is found
            }

            // Extract the substring from index i up to (but not including) j
            // This substring represents the length of the next word
            int len = Integer.parseInt(de.substring(i, j));
            // Extract the actual word based on the length found above
            String word = de.substring(j + 1, j + 1 + len);
            // Add the decoded word to the list
            li.add(word);
            // Move i to the start of the next segment
            i = j + 1 + len;
        }

        // Return the final list of decoded strings
        return li;
    }
}
