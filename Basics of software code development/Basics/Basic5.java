package by.etc.basic.fifth_exercise;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.

import java.util.Scanner;

public class Basic5 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number in seconds");

        while (scan.hasNextInt() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }
        int t = scan.nextInt();

        while (t < 0) {
            System.out.println("Time can't be negative" +
                    "\nEnter number in seconds");

            while (scan.hasNextInt() == false) {
                scan.next();
                System.out.println("Entered number doesn't match the expected type. Try again");
            }

            t = scan.nextInt();
        }

        System.out.println("Number in seconds is " + t);

        int hours = t / 3600;
        int min = (t % 3600) / 60;
        int sec = (t % 3600) - min * 60;

        System.out.println(hours + " ч " + min + " мин " + sec + " с ");
    }
}
