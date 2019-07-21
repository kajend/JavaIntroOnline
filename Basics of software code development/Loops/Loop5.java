package by.etc.loop.fifth_exercise;

//Даны числовой ряд и некоторое число е.
// Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
// Общий член ряда имеет вид: a(n) = 1/2^n + 1/3^n


import java.util.Scanner;

public class Loop5 {

    public static void main(String[] args) {

        double e = 0.001;
        double sum = 0;
        double a;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of series members");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            a = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));

            if (a >= e) {
                sum += a;
                System.out.println("Suitable member of series of numbers #" + i + " is " + a + "\t\t Sum is " + sum);

            } else System.out.println("Unsuitable member of series of numbers #" + i + " is " + a);
        }
        System.out.println("\nFinal sum is " + sum);
    }
}
