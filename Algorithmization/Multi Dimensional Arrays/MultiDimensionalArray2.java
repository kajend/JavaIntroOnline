package by.etc.multi_dimensional_array.second_exercise;

/*Дана квадратная матрица.
Вывести на экран элементы, стоящие на диагонали.*/

import java.util.Scanner;

public class MultiDimensionalArray2 {

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
            System.out.println("Size of matrix must be positive and > 1. Try again");

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

        System.out.print("Elements on the main diagonal: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
}
