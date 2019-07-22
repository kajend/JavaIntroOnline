package by.etc.one_dimensional_array.first_exercise;

//В массив A [N] занесены натуральные числа.
// Найти сумму тех элементов, которые кратны данному К.

import java.util.Scanner;

public class One_dimensional_array1 {

    public static void main(String[] args) {

        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size");

        while (scan.hasNextInt() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Enter array size");
        }

        int n = scan.nextInt();

        while (n <= 0) { //Размер массива должен быть положительным
            System.out.println("Entered number doesn't match the expected type. Enter POSITIVE array size");

            while (scan.hasNextInt() == false) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Enter array size");
            }

            n = scan.nextInt();
        }

        System.out.println("Enter number");

        while (scan.hasNextInt() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Enter array size");
        }

        int k = scan.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) { //Заполнение массива
            System.out.println("Enter " + i + " element");

            while (scan.hasNextInt() == false) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Enter array size");
            }

            array[i] = scan.nextInt();

            while (array[i] <= 0) { //Элементы массива — натуральные числа
                System.out.println("Elements must be POSITIVE. Enter " + i + " element");

                while (scan.hasNextInt() == false) {
                    scan.next();
                    System.out.println("Entered number doesn't match the expected type. Enter array size");
                }

                array[i] = scan.nextInt();
            }
        }

        for (int i = 0; i < n; i++) { //Проверка на кратность

            if (array[i] % k == 0) {
                sum += array[i];
                System.out.println("Element " + array[i] + " and " + k + " are multiples numbers.\nSum: " + sum);
            } else {
                System.out.println("Element " + array[i] + " and " + k + " aren't multiples numbers");
            }
        }
    }
}
