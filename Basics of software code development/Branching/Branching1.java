package by.etc.branching.first_exercise;

// Даны два угла треугольника (в градусах).
// Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

import java.util.Scanner;

public class Branching1 {

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first angle");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }

        int angle1 = scan.nextInt();

        while (angle1 <= 0 || angle1 >= 180) {
            System.out.println("Angles must be in range from 1 to 179 degrees");
            System.out.println("Enter first angle");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }
            angle1 = scan.nextInt();
        }

        System.out.println("Enter second angle");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }
        int angle2 = scan.nextInt();

        while (angle2 <= 0 || angle2 >= 180) {
            System.out.println("Angles must be in range from 1 to 179 degrees");
            System.out.println("Enter second angle");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }
            angle2 = scan.nextInt();
        }

        if (angle1 + angle2 < 180) {
            System.out.println("Triangle exists");

            if ((angle1 + angle2 == 90) || angle1 == 90 || angle2 == 90) {
                System.out.println("Triangle is rectangular");
            } else {
                System.out.println("Triangle is not rectangular");
            }
        } else {
            System.out.println("Triangle doesn't exist");
        }
    }
}
