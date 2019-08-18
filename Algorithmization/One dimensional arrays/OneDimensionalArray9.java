package by.etc.one_dimensional_array.nineth_exercise;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
//Если таких чисел несколько, то определить наименьшее из них.

import java.util.Scanner;

public class OneDimensionalArray9 {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size");
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }

        int size = scan.nextInt();

        while (size <= 0) {
            System.out.println("Array size must be positive");
            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }
            size = scan.nextInt();
        }

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) { //Заполнение массива
            array[i] = (int) Math.round(Math.random() * 20 - 10);
            System.out.print(array[i] + " ");
        }

        int number = array[0];
        int count = 1, maxCount = 1;

        for (int i = 0; i < array.length; i++) { //Подсчет количества элементов + выбор наиболее встречающегося числа

            for (int j = 1; j < array.length; j++) {

                if (array[i] == array[j]) {

                    if (i == j)
                        continue;

                    count++;
                }
            }

            if (count > maxCount) {
                number = array[i];
                maxCount = count;

            } else if (count == maxCount) {

                if (array[i] < number) {
                    number = array[i];
                }
            }
            count = 1;
        }

        System.out.println("\nMost common number is " + number + ". Count: " + maxCount);
    }
}

