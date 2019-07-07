package by.etc.basics.sixth_exercise;

//Для данной области составить линейную программу, которая печатает true,
// если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае

import java.util.InputMismatchException;
import java.util.Scanner;

public class Basics6 {

    public static void main(String[] args) {

        System.out.println("Enter x coordinate");
        Scanner scan = new Scanner(System.in);

        try {
            int x = scan.nextInt();
            System.out.println("Enter y coordinate");
            int y = scan.nextInt();

            if ((((x >= -4 && x <= 4) && (y >= -3 && y <= 0))
                    || ((x >= -2 && x <= 2) && (y >= 0 && y <= 4))))
                System.out.println("true");
            else System.out.println("false");

        } catch (InputMismatchException e) {
            System.out.println("Entered number doesn't match the expected type");
        }
    }
}
