package Conditional_Statment;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );

        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter operator");
        char operator = sc.next().charAt(0);
        System.out.println("Enter B");
        int b = sc.nextInt();

        switch (operator) {
            case '+': System.out.println(a+b);
               break;
            case '-': System.out.println(a-b);
                break;
            case '*': System.out.println("multiplication is :"+a*b);
                break;
            case '/': System.out.println(a/b);
                break;
        
            default:
                System.out.println("Wrong operator enter");
        }
    }
}
