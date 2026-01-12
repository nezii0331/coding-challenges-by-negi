// Objective
// In this challenge, we practice solving problems based on the Central Limit Theorem. Check out the Tutorial tab for learning materials!

// Task
// A large elevator can transport a maximum of 9800 pounds. Suppose a load of cargo containing 49  
// boxes must be transported via the elevator. The box weight of this type of cargo follows a distribution with a mean of 205 pounds 
// and a standard deviation of 15 pounds. Based on this information, what is the probability that all  boxes can be safely loaded into the freight elevator and transported?

import java.io.*;
import java.util.*;

public class day05_class{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner (System.in);
        double largeEle = scan.nextDouble();
        int boxNumber = scan.nextInt();
        double avarageBox = scan.nextDouble();
        double avarageDif = scan.nextDouble();

        double result = possibility(largeEle, boxNumber, avarageBox, avarageDif);
        System.out.printf("%.4f%n", result);
        
    }
    
    public static double possibility(double largeEle, int boxNumber, double avarageBox,  double avarageDif){
        double meanTotal = avarageBox * boxNumber;
        double standardDif = Math.sqrt(boxNumber) * avarageDif;
           
        double zScore = (largeEle - meanTotal ) / standardDif; 
        
        double probability = 0.5*(1+ erf(zScore / Math.sqrt(2)));
        
        return probability;
    }
        static double erf(double x) {
        double sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);

        double a1 = 0.254829592;
        double a2 = -0.284496736;
        double a3 = 1.421413741;
        double a4 = -1.453152027;
        double a5 = 1.061405429;
        double p = 0.3275911;

        double t = 1.0 / (1.0 + p * x);
        double y = 1.0 - (((((a5 * t + a4) * t) + a3) * t + a2) * t + a1)
                            * t * Math.exp(-x * x);

        return sign * y;
        }

}
