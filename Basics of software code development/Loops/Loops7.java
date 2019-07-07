package by.etc.loops.seventh_exercise;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Loops7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter m");
        int m = scan.nextInt();
        System.out.println("Enter n");
        int n = scan.nextInt();

        while (m <= 0 && n <= 0) {
            System.out.println("m and n must be natural numbers\nEnter m");
            m = scan.nextInt();
            System.out.println("Enter n");
            n = scan.nextInt();
        }

        while (m <= 0 && n > 0) {
            System.out.println("m must be natural number\nEnter m");
            m = scan.nextInt();
        }

        while (m > 0 && n <= 0) {
            System.out.println("n must be natural number\nEnter n");
            n = scan.nextInt();
        }

        while (n < m) {
            System.out.println("m must be greater than n\nEnter m");
            m = scan.nextInt();
            System.out.println("Enter n");
            n = scan.nextInt();
        }

        for (int i = m; i <= n; i++) { //Цикл от m до n
            System.out.print("\nNumber  " + i + "   divisors:  ");

            for (int j = 2; j < i; j++) { //Цикл для делителей от 2 до n-1

                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }
}

