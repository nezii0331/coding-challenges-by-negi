//leetcode 1002
//1002. Find Common Characters

public class 07 {
    public List<String> commonChars(String[] words) {

        // for brute force i need to loop all the elements than output the same elements
        // in word there are already been separate
        List<String> ans = new ArrayList<>();

        int[] checkList = new int[26]; // a-z is (0-25)
        System.out.println("check integer array: " + Arrays.toString(checkList));

        String first = words[0];
        System.out.println("1/check first one string: " + first);

        // pull out first char to calculate
        for (int y : first.toCharArray()) {
            int list = y - 'a';
            checkList[list]++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] freq = new int[26];
            // i need to separate each word
            String st = words[i];
            System.out.println("==this is word: " + words[i]);
            for (int j = 0; j < st.length(); j++) {
                char c = st.charAt(j);
                System.out.println("1. this is each chara in words: " + c);
                int currentIdx = c - 'a';
                System.out.println("2/ check where we are :" + currentIdx);
                freq[currentIdx]++;
                System.out.println("3/ check final:" + freq[currentIdx]);
            }
            // already spilt the chars then substraction

            for (int k = 0; k < 26; k++) {
                checkList[k] = Math.min(checkList[k], freq[k]);
                System.out.println("Less:" + checkList[k]);
            }
        }

        System.out.println("(fin)check integer array: " + Arrays.toString(checkList));
        // then check each loop
        // word[1] = bella. word[2] = label. word[3] = roller
        for (int u = 0; u < 26; u++) {
            for (int t = 0; t < checkList[u]; t++) {
                ans.add(String.valueOf((char) ('a' + u)));
                System.out.println("frequency:" + checkList[u]);
            }
        }

        return ans;
    }
}
