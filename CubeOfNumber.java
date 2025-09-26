package pk.org.cas.WhileAssignment2;

import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {
     int i = 1;
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while (i<=n){
            int cube = i*i*i;
            System.out.println("cube of "+i+" is "+cube);
            i++;
        }

    }
}
