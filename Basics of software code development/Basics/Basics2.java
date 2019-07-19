package by.etc.basic.second_exercise;

//Вычислить значение выражения по формуле
// (все переменные принимают действительные значения): (𝑏+√(𝑏2+4𝑎𝑐))/2𝑎−𝑎3𝑐+𝑏−2

import java.util.Scanner;

public class Basic2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a");

        while (scan.hasNextDouble() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected DOUBLE type. Try again");
        }

        double a = scan.nextDouble();

        while (a == 0) {
            System.out.println("NOT INCLUDED IN THE RANGE OF VALID VALUES");
            a = scan.nextDouble();
        }

        System.out.println("Enter b");

        while (scan.hasNextDouble() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected DOUBLE type. Try again");
        }

        double b = scan.nextDouble();

        while (b == 0) {
            System.out.println("NOT INCLUDED IN THE RANGE OF VALID VALUES");
            b = scan.nextDouble();
        }

        System.out.println("Enter c");

        while (scan.hasNextDouble() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected DOUBLE type. Try again");
        }

        double c = scan.nextDouble();

        System.out.println("The value is: "
                + ((b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + 1 / (b * b)));
    }
}
