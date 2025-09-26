package pk.org.cas.WhileAssignment2;

import java.util.Scanner;

public class TableOfGivenNumber {
    public static void main(String[] args) {
    int i = 1;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    int multi = 0 ;

    while (i<=10){
        multi = number*i;
        System.out.println(number+" * "+i++ +" = "+multi);
    }

    }



}
