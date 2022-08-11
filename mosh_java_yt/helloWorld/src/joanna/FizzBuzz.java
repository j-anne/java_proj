package joanna;

import java.util.Scanner;

public class FizzBuzz {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int value = scanner.nextInt();

        // Solution for if statement
        if (value % 5 == 0) {
            if (value % 3 == 0)
                System.out.println("FizzBuzz");
            System.out.println("Fizz");
        }
        else if (value % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(value);

    }
}
