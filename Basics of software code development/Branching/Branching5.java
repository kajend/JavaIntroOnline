package by.etc.branching.fifth_exercise;

//Вычислить значение функции: (x * x - 3 * x + 9)), x <= 3 и (1 / (x * x * x + 6)), x > 3

import java.util.Scanner;

public class Branching5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }

        double x = scan.nextDouble();

        if (x <= 3) {
            System.out.println("If x <= 3\nFunction is " + (x * x - 3 * x + 9));
        } else {
            System.out.println("If x > 3\nFunction is " + (1 / (x * x * x + 6)));
        }
    }
}
