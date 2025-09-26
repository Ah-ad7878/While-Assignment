package pk.org.cas.WhileAssignment2;

import java.util.Scanner;

public class SumOfNatuarlNumber {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i<=10){
            System.out.println("natural number "+i);
            sum += i;
            System.out.println("sum "+sum );
            i++;
        }
    }


}

