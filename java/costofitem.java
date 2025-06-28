/*Question 3 : Enter cosr of 3 items from the user (using float data type)- a pencil a pen and an eraser. 
You have to output the total cost of the items back to the user as their bill.
(add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)   */
import java.util.Scanner;

public class costofitem {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the price");

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
    
        float total = pencil + pen + eraser;

         System.out.println("Bill is :=  "+total);
         
         float newtotal = total + ( 0.18f * total);

         System.out.println(newtotal);
        // float gst = (total/100)*18;
        //   System.out.println(gst);
    }
}

