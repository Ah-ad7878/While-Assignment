package pk.org.cas.WhileAssignment2;

public class OddNumber {
    public static void main(String[] args) {
   int n = 1;
   int sum = 0;

   while (n<=10){
       if (n % 2 != 0) {
           System.out.println("odd number "+n++);
           sum += n;
           n++;
           System.out.println("Sum of odd number "+sum);

       }
       }
   }



}
