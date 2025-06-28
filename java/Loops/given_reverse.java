package Loops;

public class given_reverse {
    public static void main(String[] args) {
        int num = 10899;
        int rev = 0;
        while (num != 0) {
           int LastDigit = num % 10;
           rev = (rev*10)+LastDigit;
           num = num / 10; 
        }
        System.out.println(rev);
    }
}
