package by.etc.one_dimensional_array.second_exercise;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап.
//Заменить все ее члены, большие данного Z, этим числом.
//Подсчитать количество замен.

import java.util.Scanner;

public class OneDimensionalArray2 {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");

        while (scan.hasNextDouble() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }

        double z = scan.nextDouble(); //Число, которым надо заменить элементы, большие данного числа

        System.out.println("Enter array size");

        while (scan.hasNextDouble() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Enter array size");
        }

        int n = scan.nextInt();

        while (n <= 0) { //Размер массива должен быть положительный
            System.out.println("Entered number doesn't match the expected type. Enter POSITIVE array size");

            while (scan.hasNextInt() == false) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Enter array size");
            }

            n = scan.nextInt();
        }

        double[] array = new double[n];

        for (int i = 0; i < n; i++) { //Заполнение массива
            System.out.println("Enter " + i + " element");

            while (scan.hasNextDouble() == false) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            array[i] = scan.nextDouble();
        }
        System.out.print("\nArray: "); //Вывод исходного массива

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        int replacement = 0;
        System.out.print("\nNew array: ");

        for (int i = 0; i < n; i++) { //Замена(с подсчетом количества) + вывод нового массива

            if (array[i] > z) {
                array[i] = z;
                replacement++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println("\nNumber of replacement: " + replacement);
    }
}
