package Conditional_Statment;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        switch (a){
            
            case 1 : System.out.println("somosa");
                    break;
            case 2 : System.out.println("mango");
                    break;
            case 3 : System.out.println("burger");
                    break;
            default  : System.out.println("we wake up");
        }

    }
}
