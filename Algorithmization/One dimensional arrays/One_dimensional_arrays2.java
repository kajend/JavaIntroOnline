package by.etc.one_dimensional_arrays.second_exercise;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап.
// Заменить все ее члены, большие данного Z, этим числом.
// Подсчитать количество замен.

import java.util.InputMismatchException;
import java.util.Scanner;

public class One_dimensional_arrays2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");

        try {
            double z = scan.nextDouble();
            System.out.println("Enter array size");
            int n = scan.nextInt();
            double[] array = new double[n];

            for (int i = 0; i < n; i++) { //Заполнение массива
                System.out.println("Enter " + i + " element");
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

        } catch (InputMismatchException e) {
            System.out.println("Entered number doesn't match the expected type");
        } catch (NegativeArraySizeException e) {
            System.out.println("Negative array size");
        } catch (OutOfMemoryError e) {
            System.out.println("Out of memory");
        }
    }
}
