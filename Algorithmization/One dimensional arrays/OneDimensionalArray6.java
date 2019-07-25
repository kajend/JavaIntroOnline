package by.etc.one_dimensional_array.sixth_exercise;

//Задана последовательность N вещественных чисел.
//Вычислить сумму чисел, порядковые номера которых являются простыми числами.

import java.util.Scanner;

public class OneDimensionalArray6 {

    public static void main(String[] args) {

        double sum = 0;

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

        double[] array = new double[size];

        /* По умолчанию Math.random() генерирует вещественные числа в диапазоне [0;1).
        В данном случае в диапазоне [-100;100).
        Формула для другого интервала( Math.random() * (b-a) ) + a) */

        for (int i = 0; i < array.length; i++) {

            array[i] = Math.random() * 200 - 100;

            boolean isNotSimple = false;

            for (int j = 2; j <= i / 2; j++) { //Проверка: простое ли число (проверяем делители от 2 до size/2)

                if (i % j == 0)  //Если остаток = 0, т.е. нашелся делитель, число не является простым
                    isNotSimple = true;
            }

            if (i != 0 && i != 1 && !isNotSimple) { //Если число простое
                sum += array[i];
                System.out.print("This element is suitable. ");
            }

            System.out.println(" Element #" + i + ": " + array[i]);
        }

        System.out.println("\nSum: " + sum);
    }
}


