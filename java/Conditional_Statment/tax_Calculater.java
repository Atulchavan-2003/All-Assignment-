package Conditional_Statment;

import java.util.Scanner;

public class tax_Calculater {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in );
        System.out.println("Enter the your encome");
        int income = sc.nextInt();
        int tax;

        if(income < 500000){
            tax = 0;
        }
        else if (income >= 500000 && income <= 1000000) {
            tax = income/100*20;
            //tax-=income;
        }
        else{
            tax = income/100*30;
           // tax =tax-income;
        }
        System.out.println("your tax is : ="+tax);

         if(tax > 0 ){
            int tax1 = income-tax;
            System.out.println(tax1+"    tax subtract into income");
         }
    }
}
