package pk.org.cas.WhileAssignment2;

import java.util.Scanner;

public class MultiplicationOfNumber2 {
    public static void main(String[] args) {
    int i = 1;
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter as number: ");
        int n = sc.nextInt();

        int multi = 0;
        while (i<=10){
            int j = 1;
            while (j<=n){
                multi = j*i;
                System.out.println(j+" * "+i+" = "+multi);
                j++;

            }
            System.out.println();
            i++;
        }

    }



}
