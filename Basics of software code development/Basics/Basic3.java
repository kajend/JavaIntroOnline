package by.etc.basic.third_exercise;

//Вычислить значение выражения по формуле
// (все переменные принимают действительные значения): (𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦)∗𝑡𝑔 𝑥𝑦

import java.util.Scanner;

import static java.lang.Math.*;

public class Basic3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter x in degrees");
        while (scan.hasNextDouble() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected DOUBLE type. Try again");
        }
        double x = scan.nextDouble();

        System.out.println("Enter y in degrees");
        while (scan.hasNextDouble() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected DOUBLE type. Try again");
        }
        double y = scan.nextDouble();

        while ((x - 45) % 360 == 0 && (y - 45) % 360 == 0) {
            System.out.println("Zero in the denominator. Enter another angle");
            System.out.println("Enter x in degrees");
            x = scan.nextDouble();
            System.out.println("Enter y in degrees");
            y = scan.nextDouble();
        }

        System.out.println("The value is: "
                + ((sin(toRadians(x)) + cos(toRadians(y))
                / (cos(toRadians(x) - sin(toRadians(y))) * tan(toRadians(x * y))))));
    }
}
