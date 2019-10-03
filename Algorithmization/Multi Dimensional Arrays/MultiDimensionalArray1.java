package by.etc.multi_dimensional_array.first_exercise;

/*Дана матрица.
Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего*/

import java.util.Scanner;

public class MultiDimensionalArray1 {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of lines");

        while (!scan.hasNextInt()) {
            System.out.println("Entered number doesn't match the expected type. Try again");
            scan.next();
        }
        int line = scan.nextInt();

        while (line <= 1) {
            System.out.println("Number of lines must be POSITIVE and > 1. Try again");

            while (!scan.hasNextInt()) {
                System.out.println("Entered number doesn't match the expected type. Try again");
                scan.next();
            }
            line = scan.nextInt();
        }

        System.out.println("Enter number of columns");

        while (!scan.hasNextInt()) {
            System.out.println("Entered number doesn't match the expected type. Try again");
            scan.next();
        }

        int column = scan.nextInt();

        while (column <= 0) {
            System.out.println("Number of columns must be POSITIVE. Try again");

            while (!scan.hasNextInt()) {
                System.out.println("Entered number doesn't match the expected type. Try again");
                scan.next();
            }
            column = scan.nextInt();
        }

        int[][] array = new int[line][column];

        System.out.println("Array: ");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) Math.round(Math.random() * 20 - 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Needed columns:");

        for (int j = 0; j < array[0].length; j++) {

            if (column == 1) {
                System.out.println("There are no suitable columns in this matrix");
            }

            if (j % 2 != 0) {

                for (int i = 0; i < array.length; i++) {

                    if (array[0][j] > array[line - 1][j]) {

                        System.out.print(array[i][j] + " ");

                    }
                }
                System.out.println();
            }
        }
    }
}

