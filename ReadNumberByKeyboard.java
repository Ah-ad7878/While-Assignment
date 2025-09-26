package pk.org.cas.WhileAssignment2;

import java.util.Scanner;

public class ReadNumberByKeyboard {
    public static void main(String[] args) {
        int number = 1;
        Scanner sc = new Scanner(System.in);
        int sum = 0;


        double average = 0;
        while (number <= 10) {
            System.out.print("Enter a num " + number + ":");
            int num = sc.nextInt();
            sum += num;

            average = sum / 10.0;
            number++;

        }
        System.out.println("sum of the number " + sum);
        System.out.println("Average of the number " + average);
    }


}
