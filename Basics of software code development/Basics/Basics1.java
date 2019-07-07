package by.etc.basics.first_exercise;

//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Basics1 {
    public static void main(String[] args) {

        System.out.println("Enter a");
        Scanner scan = new Scanner(System.in);

        try {
            double a = scan.nextDouble();
            System.out.println("Enter b");
            double b = scan.nextDouble();
            System.out.println("Enter c");
            double c = scan.nextDouble();
            System.out.println("Your function is: " + (((a - 3) * b / 2) + c));

        } catch (InputMismatchException e) {
            System.out.println("Entered number doesn't match the expected type");
        }
    }
}
