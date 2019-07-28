package by.etc.one_dimensional_array.eigth_exercise;

//Дана последовательность целых чисел a1, a2, ..., an .
//Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2, ..., an)

import java.util.Scanner;

public class OneDimensionalArray8 {

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

        for (int i = 0; i < array.length; i++) { //Заполнение исходного массива
            array[i] = (int) Math.round(Math.random() * 20 - 10);
            System.out.print(array[i] + "  ");
        }

        int min = array[0];
        int counter = 0;

        //Нахождение минимального элемента + подсчет количества таких элементов

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
                counter = 1;

            } else if (array[i] == min) {
                counter++;
            }
        }

        int[] newArray = new int[size - counter];

        System.out.println("\n\nMinimal element: " + min + ". Number of such elements:  " + counter);

        for (int i = 0, j = 0; i < array.length; i++, j++) { //Заполнение нового массива

            if (array[i] != min) {
                newArray[j] = array[i];
            } else {
                j--;
            }
        }

        System.out.println("\nNew array: ");//Вывод нового массива
        for (int j = 0; j < newArray.length; j++) {
            System.out.print("  " + newArray[j]);
        }
    }
}
