package Loops;

import java.util.Scanner;

public class natural_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number");
        int n = sc.nextInt();
         int i = 1;
         int sum = 0;
        while (i <= n) {
           sum = sum + i;
           i++;
        }
        System.out.println(sum);
    }
}
