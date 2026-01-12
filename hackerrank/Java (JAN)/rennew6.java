//Day 12
/*  Inheritance
 */

import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;

public class rennew6 {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        String first = scan.next();
        String Last = scan.next();
        String id = scan.nextLine();
        int numberOfScores = scan.nextInt();
        int[] manyScores = new int[numberOfScores];

        for (int i = 0; i < numberOfScores; i++) {
            int scores = scan.nextInt();

            manyScores[i] = scores;

        }

        // i use force to calculate the number of the score
        int result;
        int sum = 0;
        for (int x = 0; x < numberOfScores; x++) {
            sum += manyScores[x];
        }
        result = sum / numberOfScores;

        System.out.println("Name: " + Last + ", " + first);
        System.out.println("ID:" + id);
        char Grade = calculate(result);
        System.out.println("Grade: " + Grade);

        scan.close();
    }

    public static char calculate(int result) {
        // score deffiniatly bigger than 0 and less than 100
        char letter;
        if (result < 40) {
            letter = 'T';
        } else if (result >= 40 && result < 55) {
            letter = 'D';
        } else if (result >= 55 && result < 70) {
            letter = 'P';
        } else if (result >= 70 && result < 80) {
            letter = 'A';
        } else if (result >= 80 && result < 90) {
            letter = 'E';
        } else {
            letter = 'O';
        }
        return letter;
    }

}