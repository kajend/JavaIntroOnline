package by.etc.basic.first_exercise;

//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

import java.util.Scanner;

public class Basic1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a");
        while (scan.hasNextDouble() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected DOUBLE type. Try again");
        }
        double a = scan.nextDouble();

        System.out.println("Enter b");
        while (scan.hasNextDouble() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected DOUBLE type. Try again");
        }
        double b = scan.nextDouble();

        System.out.println("Enter c");
        while (scan.hasNextDouble() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected DOUBLE type. Try again");
        }
        double c = scan.nextDouble();

        System.out.println("Your function is: " + (((a - 3) * b / 2) + c));
    }
}
