package by.etc.one_dimensional_array.seventh_exercise;

//Даны действительные числа а1,а2,а3...а2n. Найти max(a1+a2n,a2+a2n-1...an+an+1)

import java.util.Scanner;

public class OneDimensionalArray {

    public static void main(String[] args) {

        @SuppressWarnings("recourse")
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }

        int size = scan.nextInt();

        while (size <= 0) {
            System.out.println("Array size must be POSITIVE");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            size = scan.nextInt();
        }

        int[] array = new int[2 * size];

        for (int i = 0; i < array.length; i++) { //Заполнение и вывод массива
            array[i] = (int) Math.round(Math.random() * 15 - 5);
            System.out.println("Element #" + i + ":  " + array[i]);
        }

        int max;

        max = array[0] + array[array.length - 1];

        int j = 2;

        for (int i = 1; i < size; i++) { //Нахождение максимальной суммы

            if (max < array[i] + array[2 * size - j]) {
                max = array[i] + array[2 * size - j];
            }
            j++;
        }
        System.out.println("\nMaximum sum: " + max);
    }
}
