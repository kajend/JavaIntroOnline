package by.etc.one_dimensional_array.fourth_exercise;

//Даны действительные числа а1 ,а2 ,..., аn .
//Поменять местами наибольший и наименьший элементы.

import java.util.Scanner;

public class OneDimensionalArray4 {

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
            System.out.println("Array size must be POSITIVE");

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

        for (int i = 0; i < array.length; i++) { //Заполнение массива
            array[i] = Math.random() * 200 - 100;
        }

        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++) { //Вывод массива
            System.out.print(array[i] + "   ");
        }

        double min = array[0];
        double max = array[0];
        double temp;
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < array.length; i++) { //Поиск минимального элемента
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }

        for (int i = 0; i < array.length; i++) { //Поиск максимального элемента
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        //Меняем местами максимальные и минимальный элементы
        temp = array[indexMin];
        array[indexMin] = array[indexMax];
        array[indexMax] = temp;

        System.out.println("\nNew array: ");
        for (int i = 0; i < array.length; i++) { //вывод
            System.out.print(array[i] + "    ");
        }
    }
}
