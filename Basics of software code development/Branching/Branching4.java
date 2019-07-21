package by.etc.branching.fourth_exercise;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие

import java.util.Scanner;

public class Branching4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        @SuppressWarnings("resource")
        System.out.println("Enter A parameter of the hole");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }

        int a = scan.nextInt();

        while (a <= 0) {
            System.out.println("Wrong hole size\nEnter A parameter of the hole");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            a = scan.nextInt();
        }

        System.out.println("Enter B parameter of the hole");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }

        int b = scan.nextInt();

        while (b <= 0) {
            System.out.println("Wrong hole size\nEnter B parameter of the hole");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            b = scan.nextInt();
        }

        System.out.println("Enter the x size of a brick");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }

        int x = scan.nextInt();

        while (x <= 0) {
            System.out.println("Wrong brick size\nEnter x parameter of the brick");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            x = scan.nextInt();
        }

        System.out.println("Enter the y size of a brick");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }

        int y = scan.nextInt();

        while (y <= 0) {
            System.out.println("Wrong brick size\nEnter y parameter of the brick");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            y = scan.nextInt();
        }

        System.out.println("Enter the z size of a brick");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }

        int z = scan.nextInt();

        while (z <= 0) {
            System.out.println("Wrong brick size\nEnter z parameter of the brick");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            z = scan.nextInt();
        }

        if ((x <= a && y <= b) || (x <= b && y <= a)) {
            System.out.println("The brick will pass through the hole according to the parameters x and y");
        } else {
            System.out.println("The brick WON'T pass through the hole according to the parameters x and y");
        }

        if ((z <= a && y <= b) || (z <= b && y <= a)) {
            System.out.println("The brick will pass through the hole according to the parameters y and z");
        } else {
            System.out.println("The brick WON'T pass through the hole according to the parameters y and z");
        }

        if ((x <= a && z <= b) || (x <= b && z <= a)) {
            System.out.println("The brick will pass through the hole according to the parameters x and z");
        } else {
            System.out.println("The brick WON'T pass through the hole according to the parameters x and z");
        }
    }
}
