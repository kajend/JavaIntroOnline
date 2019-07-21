package by.etc.loop.first_exercise;

//Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа

import java.util.Scanner;

public class Loop1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter number");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type");
        }

        int number = scan.nextInt();

        while (number <= 0) {
            System.out.println("Enter a positive integer");

            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type");
            }
            number = scan.nextInt();
        }

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("The sum from 1 to " + number + " is " + sum);
    }
}
