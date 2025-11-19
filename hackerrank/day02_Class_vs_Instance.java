/*
 * HackerRank 30 Days of Code
 * Day 02: Class vs. Instance
 * 
 */
/*
 * Throwdown — Class vs. Instance
 * In this challenge, we're going to learn about the difference between a class and an instance; because this is an Object Oriented concept, it's only enabled in certain languages.
 * Check out the Tutorial tab for learning materials and an instructional video!
 * 
 * Task
 * Write a Person class with an instance variable, age, and a constructor that takes an integer, initialAge, as a parameter. The constructor must assign initialAge to age after confirming the argument passed as initialAge is not negative; if a negative argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0.. In addition, you must write the following instance methods:
 * 1. yearPasses() should increase the age instance variable by 1.
 * 2. amIOld() should perform the following conditional actions:
 *    - If age < 13, print You are young..
 *    - If age >= 13 and age < 18, print You are a teenager..
 *    - Otherwise, print You are old..
 */
import java.io.*;
import java.util.*;

public class day02_Class_vs_Instance {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i = 0; i < T; i++){
        int age = scan.nextInt(); //read oringinal age
        Person p = new Person(age); //create a person
        p.amIOld();
        
        for(int j =0; j < 3; j++){
            p.yearPasses();
        }
        
        p.amIOld();
        System.out.println();
        }
        scan.close();
    }
}

   
    class Person{
        private int age;
        
        public Person(int initialAge){
            if(initialAge < 0){
                System.out.println("Age is not valid, setting age to 0.");
                this.age = 0; //already store the age in here
            } else {
                this.age = initialAge;
            }
        }
        
        public void yearPasses(){
            age += 1 ;   //age =  age + 1
            // or we can write age++
        }

        public void amIOld(){
            if(age < 13){
                System.out.println("You are young.");
            } else if (age >= 13 && age < 18){
                System.out.println("You are a teenager.");        
            } else{
                System.out.println("You are old.");
            }
        }
    }
