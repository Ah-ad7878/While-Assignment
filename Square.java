package pk.org.cas.WhileAssignment2;

public class Square {
    public static void main(String[] args) {
        int number = 1;

        while (number<=10){
            System.out.println("Number "+number);
            int square = number*number;
            System.out.println("Square of number =  "+square);
            number++;

        }
    }
}
