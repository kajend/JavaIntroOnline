package by.etc.basic.sixth_exercise;

//Для данной области составить линейную программу, которая печатает true,
// если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае

import java.util.Scanner;

public class Basic6 {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x coordinate");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }
        int x = scan.nextInt();

        System.out.println("Enter y coordinate");

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }
        int y = scan.nextInt();

        if ((((x >= -4 && x <= 4) && (y >= -3 && y <= 0))
                || ((x >= -2 && x <= 2) && (y >= 0 && y <= 4))))
            System.out.println("true");
        else System.out.println("false");
    }
}
