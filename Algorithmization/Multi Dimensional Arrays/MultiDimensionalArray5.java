package by.etc.multi_dimensional_array.fifth_exercise;

/*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

    1 1 1 ... 1
    2 2 2 ... 0
    3 3 3 ..0 0
    n-1 n-1 0... 0
    n 0 0 ... 0
*/

import java.util.Scanner;

public class MultiDimensionalArray5 {

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

        System.out.println("Array: ");

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[0].length; j++) {

                if (size - i - j <= 0) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = i;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}