//Day 2 
// Task
// In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

import java.util.*;
import java.io.*;

//method 1

public class D2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();

        scan.close();

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }
}

// method 2

public class D2 {
    public static void main(String[] systemIn) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int third = Integer.parseInt(br.readLine());

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

    }
}