package by.etc.loop.seventh_exercise;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Loop7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter m");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }

        int m = scan.nextInt();

        System.out.println("Enter n");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }

        int n = scan.nextInt();

        while (m <= 0 && n <= 0) {
            System.out.println("m and n must be natural numbers\nEnter m");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            m = scan.nextInt();

            System.out.println("Enter n");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            n = scan.nextInt();
        }

        while (m <= 0 && n > 0) {

            System.out.println("m must be natural number\nEnter m");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            m = scan.nextInt();
        }

        while (m > 0 && n <= 0) {

            System.out.println("n must be natural number\nEnter n");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            n = scan.nextInt();
        }

        while (n < m) {

            System.out.println("n must be greater than m\nEnter m");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            m = scan.nextInt();

            System.out.println("Enter n");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            n = scan.nextInt();
        }

        for (int i = m; i <= n; i++) { //Цикл от m до n
            System.out.print("\nNumber  " + i + "   divisors:  ");

            for (int j = 2; j < i; j++) { //Цикл для делителей от 2 до n-1

                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}
