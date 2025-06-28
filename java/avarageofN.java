/* Question 1 : in a program, input 3 numbers : A,B,and C. You have to output the average 
   of these 3 numbers.
   (Hint : Average of N mumber is sum of those numbers divided by N)*/

import java.util.Scanner;

public class avarageofN {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        // input three number from the user
        
        System.out.println("Enter the first number ");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
          
        int N = 3;
        
        // sum of three number 

        int sum = a+b+c;

        // average of n number

        int average = sum/N;
        System.out.println(average);
        
    }
}
