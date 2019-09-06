package by.etc.one_dimensional_array.tenth_exercise;

/*Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
        элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать*/

import java.util.Scanner;

public class OneDimensionalArray10 {

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

            System.out.println("Array size must be POSITIVE. Try again");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            size = scan.nextInt();
        }

        int[] array = new int[size];

        System.out.println("Array:");

        for (int i = 0; i < array.length; i++) { //Заполнение массива
            array[i] = (int) Math.round(Math.random() * 10 + 10);
            System.out.print(array[i] + " ");
        }

        for (int i = 1; i < array.length; i += 2) { //Замена нулями каждого 2-го
            array[i] = 0;
        }

        System.out.println("\nNew array:");

        for (int i = 0; i < array.length; i++) { //Вывод нового массива
            System.out.print(array[i] + " ");
        }
    }
}
