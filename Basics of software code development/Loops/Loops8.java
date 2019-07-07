package by.etc.loops.eighth_exercise;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

import java.util.InputMismatchException;
import java.util.Scanner;

public class Loops8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter first number");
            int number1 = sc.nextInt();
            int digit1;
            System.out.println("Enter second number");
            int number2 = sc.nextInt();
            int digit2;

            if (number1 <= 0 || number2 <= 0) {
                System.out.println("Both numbers must be positive");

            } else {

                if (number1 == number2) {
                    System.out.print("The entered numbers are the same");

                } else {

                    while (number1 > 0) {

                        digit1 = number1 % 10;
                        number1 /= 10;
                        digit2 = number2;

                        while (digit2 > 0) {

                            if (digit2 % 10 == digit1) {
                                System.out.println("\t\tCoincidence: " + digit1); //Совпадение
                            } else {
                                System.out.println(" NO Coincidence.\t " + " Compared digit of the second number: " + digit2 % 10
                                        + " " + "&  Compared digit of the first number: " + digit1);
                            }
                            digit2 = digit2 / 10;
                        }
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.print("Entered number doesn't match the expected type");
        }
    }
}