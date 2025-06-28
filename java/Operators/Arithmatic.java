package Operators;

public class Arithmatic {
    public static void main(String[] args) {
        int a = 10, b = 5;
        // Binary 
        System.out.println("add = "+ (a+b) );
        System.out.println("subtract = "+ (a-b) );
        System.out.println("multiplt  = "+ (a*b) );
        System.out.println("divide = "+ (a/b) );
        System.out.println("remainder = "+ (a%b) );
        
        // Unary 

        int A = 10;
        int B = A--;
        ++A;
       
        System.out.println(A);
        System.out.println(B);

    }
}
