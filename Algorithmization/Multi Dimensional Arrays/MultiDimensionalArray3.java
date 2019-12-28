package by.etc.multi_dimensional_array.third_exercise;

/* Дана матрица.
Вывести k-ю строку и p-й столбец матрицы.*/

import java.util.Scanner;

public class MultiDimensionalArray3 {

    public static void main(String[] args) {

        @SuppressWarnings("resource")

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of matrix");

        while (!scan.hasNextInt()) {
            System.out.println("Entered number doesn't match the expected type. Try again");
            scan.next();
        }

        int size = scan.nextInt();

        while (size <= 1) {
            System.out.println("Size of matrix must be positive > 1. Try again");

            while (!scan.hasNextInt()) {
                System.out.println("Entered number doesn't match the expected type. Try again");
                scan.next();
            }
            size = scan.nextInt();
        }

        int[][] array = new int[size][size];

        System.out.println("Array: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) Math.round(Math.random() * 20 - 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int p, k;

        System.out.println("Enter p");

        while (!scan.hasNextInt()) {
            System.out.println("Entered number doesn't match the expected type. Try again");
            scan.next();
        }

        p = scan.nextInt();

        while (p >= size || p < 0) {
            System.out.println("p must be < size and >= 0. Try again");

            while (!scan.hasNextInt()) {
                System.out.println("Entered number doesn't match the expected type. Try again");
                scan.next();
            }
            p = scan.nextInt();
        }

        System.out.println("Enter k");

        while (!scan.hasNextInt()) {
            System.out.println("Entered number doesn't match the expected type. Try again");
            scan.next();
        }
        k = scan.nextInt();

        while (k >= size || k < 0) {
            System.out.println("k must be < size and >= 0. Try again");

            while (!scan.hasNextInt()) {
                System.out.println("Entered number doesn't match the expected type. Try again");
                scan.next();
            }
            k = scan.nextInt();
        }

        System.out.println("\nColumn number " + p + " and Row number " + k + ":");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {

                if (j == p || i == k)
                    System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}