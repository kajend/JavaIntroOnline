package by.etc.one_dimensional_array_fiffth_exercise;

//Даны целые числа а1 ,а2 ,..., аn .
//Вывести на печать только те числа, для которых аi > i.

import java.util.Scanner;

public class OneDimensionalArray5 {

    public static void main(String[] args) {

        System.out.println("Enter array size");

        @SuppressWarnings("recourse")
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }

        int size = scan.nextInt();

        while (size <= 0) {
            System.out.println("Array size must be POSITIVE. Try again");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            size = scan.nextInt();
        }

        int[] array = new int[size];

        /* Заполнение массива + вывод элементов,
                удовлетворяющих условию аi > i */

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 200 - 100);

            if (array[i] > i) {
                System.out.println("Needed element: " + array[i] + "   Number of element " + i);
            }
        }
    }
}

