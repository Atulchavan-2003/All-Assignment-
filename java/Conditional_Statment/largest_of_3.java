package Conditional_Statment;

import java.util.Scanner;

public class largest_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt(),b =sc.nextInt(),c= sc.nextInt(),d = sc.nextInt();

        // a=10 b=12 c=15
        if ((a >= b) && (a >= c) && (a >= d)) {
            System.out.println("A is largest number");
        }
        else if (b >= c && b >= d) {
            System.out.println("B is largest number");
        }
        else if (c >= d ) {
            System.out.println("C is largest number");
        }
        else{
            System.out.println("D is largest number");
        }
        
    }
}
