package by.etc.loops.first_exercise;

//Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа

import java.util.InputMismatchException;
import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int sum = 0;

        try {
            int number = scan.nextInt();

            while (number <= 0) {
                System.out.println("Enter a positive integer");
                number = scan.nextInt();
            }

            for (int i = 1; i <= number; i++) {
                sum += i;
            }

            System.out.println("The sum from 1 to " + number + " is " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Entered number doesn't match the expected type");
        }
    }
}
