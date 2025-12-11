//11-12-2025
// Sample Input
// a = 2
// b = 3

// Sample Output
// 5

import java.util.*;

public class day16_class {

    static int solveMeFirst(int a, int b) {
      // Hint: Type return a+b; below 
      int result;
      result = a + b;
      return result;
	}

    
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        int sum = solveMeFirst(a, b);
        System.out.println(sum);
	}
}