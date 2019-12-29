package by.etc.multi_dimensional_array.fourth_exercise;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

    1 2 3 ... n
    n n-1 n-2 ... 1
    1 2 3 ... n
    ...
    n n-1 n-2 ... 1     */

import java.util.Scanner;

public class MultiDimensionalArray4 {

    public static void main(String[] args) {

        @SuppressWarnings("resource")

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of matrix");

        while (!scan.hasNextInt()) {
            System.out.println("Entered number doesn't match the expected type");
            scan.next();
        }

        int size = scan.nextInt();

        while (size % 2 != 0 || size == 0) {
            System.out.println("Size of matrix must be even-numbered and > 0");

            while (!scan.hasNextInt()) {
                System.out.println("Entered number doesn't match the expected type");
                scan.next();
            }

            size = scan.nextInt();
        }

        int array[][] = new int[size][size];
        int sizeCopy = size;

        System.out.println("Array: ");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = j;
                System.out.print(array[i][j] + " ");
            }

            System.out.println();

            i++;

            for (int j = 0; j < array[0].length; j++) {

                array[i][j] = sizeCopy - 1;
                sizeCopy--;
                System.out.print(array[i][j] + " ");
            }

            sizeCopy = size;

            System.out.println();
        }
    }
}