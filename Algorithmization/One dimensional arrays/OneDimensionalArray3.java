package by.etc.one_dimensional_array.third_exercise;

//Дан массив действительных чисел, размерность которого N.
//Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов

import java.util.Scanner;

public class OneDimensionalArray3 {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        int size;
        int zero = 0; //Количество нулевых элементов
        int positive = 0; //Количество положительных
        int negative = 0; //Количество отрицательных

        System.out.println("Enter array size");

        while (scan.hasNextInt() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Enter array size");
        }

        size = scan.nextInt();

        while (size <= 0) {
            System.out.println("Array size must be positive");

            while (scan.hasNextInt() == false) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Enter array size");
            }

            size = scan.nextInt();
        }

        double[] arr = new double[size];

        for (int i = 0; i < arr.length; i++) { //Заполнение массива
            System.out.println("Enter " + i + " element");

            while (scan.hasNextInt() == false) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            arr[i] = scan.nextDouble();
       
            //Подсчет элементов
            if (arr[i] == 0) {
                zero++;

            } else if (arr[i] > 0) {
                positive++;

            } else if (arr[i] < 0) {
                negative++;
            }
        }
        System.out.println("Number of zero elements: " + zero + "\nNumber of positive elements: " + positive +
                "\nNumber of negative elements: " + negative);
    }
}

