package by.etc.one_dimensional_arrays.first_exercise;

//В массив A [N] занесены натуральные числа.
// Найти сумму тех элементов, которые кратны данному К.

import java.util.InputMismatchException;
import java.util.Scanner;

public class One_dimensional_arrays1 {
    public static void main(String[] args) {

        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size");

        try {
            int n = scan.nextInt();
            System.out.println("Enter number");
            int k = scan.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) { //Заполнение массива
                System.out.println("Enter " + i + " element");
                array[i] = scan.nextInt();

                while (array[i] <= 0) {
                    System.out.println("Elements must be POSITIVE. Enter " + i + " element");
                    array[i] = scan.nextInt();
                }
            }

            for (int i = 0; i < n; i++) { //Проверка на кратность + вычисление суммы

                if (array[i] % k == 0) {
                    sum += array[i];
                    System.out.println("Element " + array[i] + " and " + k + " are multiples numbers.\nSum: " + sum);
                } else {
                    System.out.println("Element " + array[i] + " and " + k + " aren't multiples numbers");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Entered number doesn't match the expected type");
        }
    }
}
