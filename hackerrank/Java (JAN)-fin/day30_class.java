// A palindrome is a word, phrase, number, or other sequence of characters which reads the same backwards and forwards. Can you determine if a given string, s, is a palindrome?

import java.io.*;
import java.util.*;

public class day30_class {
    // Write your code here.
    // stack -> LIFO
    // Quene -> FIFO

    Stack<Character> s = new Stack<>();
    Queue<Character> q = new LinkedList<>();

    // first write pushchara push
    public void pushCharacter(char ch) {
        s.push(ch);
    }

    // second write enqueue to add the queue
    public void enqueueCharacter(char ch) {
        q.add(ch);
    }

    // third write pop
    public char popCharacter() {
        char current;
        current = s.pop();
        return current;
    }

    // forth write dequeue
    public char dequeueCharacter() {
        char current;
        current = q.remove();
        return current;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
