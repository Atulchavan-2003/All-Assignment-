package Conditional_Statment;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
      System.out.println(" Enter the age");
      int age = sc.nextInt();

       if(age >= 18){
            System.out.println("adult for votting, driving");
       }

       if(age > 13 && 18 > age){
         System.out.println("teenager");
       }

       else{
        System.out.println("not adult ");
       }

    }
}
