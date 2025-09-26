package pk.org.cas.WhileAssignment2;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int number = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
       int n =  sc.nextInt();

        int factorial = 1;
        while (number<=n){
            factorial *= number;
            number++;
            System.out.println("factorial "+factorial);
        }
    }
}
