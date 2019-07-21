package by.etc.loop.second_exercise;

//Вычислить значения функции на отрезке [а,b] c шагом h: x, x > 2; -x, x <= 2

import java.util.Scanner;

public class Loop2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type");
        }

        double a = scan.nextDouble();

        System.out.println("Enter b");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type");
        }

        double b = scan.nextDouble();

        System.out.println("Enter h");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type");
        }

        double h = scan.nextDouble();

        if (h > Math.abs(b - a)) {
            System.out.println("Step greater than the length of the segment");


        } else {
            System.out.println("Enter x");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type");
            }

            double x = scan.nextDouble();

            if (x > 2) {
                System.out.printf("%s %5s", "Iteration", "Function\n");

                int i = 0;

                for (x = a; x <= b; x += h) {
                    i++;
                    System.out.printf("%5d\t %.3f\n", i, x);
                }

            } else {
                System.out.printf("%s %5s", "Iteration", "Function\n");

                int j = 0;

                for (x = a; x <= b; x += h) {
                    j++;
                    System.out.printf("%5d\t %.3f\n", j, -x);
                }
            }
        }
    }
}
