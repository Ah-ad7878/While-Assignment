package pk.org.cas.WhileAssignment2;

import java.util.Scanner;

public class EnterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println();

        int i = 1;
        int zero = 0;
        int positive = 0;
        int negetive  = 0;
        while (i<=number) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();


            if (num == 0) {
                zero++;
            } else if (num>=0) {
                positive++;
            } else if (num<=0) {
                negetive++;
            }
            i++;

        }
        System.out.println("strength of Zero number is "+zero);
        System.out.println("strength of positive  number is "+positive);
        System.out.println("strength of negative number is "+negetive);

    }
}
