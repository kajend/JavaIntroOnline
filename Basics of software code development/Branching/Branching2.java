package by.etc.branching.second_exercise;

//Найти max{min(a, b), min(c, d)}.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Branching2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a");

        int min1, min2, max;

        try {
            int a = scan.nextInt();
            System.out.println("Enter b");
            int b = scan.nextInt();
            System.out.println("Enter c");
            int c = scan.nextInt();
            System.out.println("Enter d");
            int d = scan.nextInt();

            if (a > b) {
                min1 = b;
            } else {
                min1 = a;
            }
            System.out.println("min(a, b) = " + min1);

            if (c > d) {
                min2 = d;
            } else {
                min2 = c;
            }
            System.out.println("min(c, d) = " + min2);

            if (min1 > min2) {
                max = min1;
            } else {
                max = min2;
            }
            System.out.println("max{min(a, b), min(c, d)} = " + max);

        } catch (InputMismatchException e) {
            System.out.println("Entered number doesn't match the expected type");
        }
    }
}
