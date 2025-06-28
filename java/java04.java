import java.util.*;

public class java04 {
    public static void main (String args[]){
      // sum of a & b
//         int a = 10, b = 2;
//         int sum = a+b;
//         System.out.println(sum);
        
        /*input in java*/

        Scanner sc = new Scanner(System.in );

//        String  atul = sc.next(); // use for single word
//        System.out.println(atul);

//        String atul2 = sc.nextLine(); // use for multiple word
//        System.out.println(atul2);

        // sum of a and b from user
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("="+sum);
    }
}

