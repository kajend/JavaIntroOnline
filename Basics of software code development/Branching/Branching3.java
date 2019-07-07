package by.etc.branching.third_exercise;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
// Определить, будут ли они расположены на одной прямой.

//Аксиома: через любые две точки проходит прямая, и притом только одна.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Branching3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1");
        double k, b; //Уравнение прямой y = kx + b,
        // k - угловой коэффициент, b - свободный член

        try {
            double x1 = scan.nextDouble();
            System.out.println("Enter y1");
            double y1 = scan.nextDouble();
            System.out.println("Enter x2");
            double x2 = scan.nextDouble();
            System.out.println("Enter y2");
            double y2 = scan.nextDouble();
            System.out.println("Enter x3");
            double x3 = scan.nextDouble();
            System.out.println("Enter y3");
            double y3 = scan.nextDouble();

            if (x1 == x2 && y1 == y2 && x1 == x3 && y1 == y3 && x2 == x3 && y2 == y3) {
                //Если координаты всех точек совпадают
                System.out.println("This is one point");

            } else {

                if (x1 != x2 && y1 != y2 && x1 != x3 && y1 != y3 && x2 != x3 && y2 != y3) {
                    //Если координаты всех точек разные
                    k = (y2 - y1) / (x2 - x1);
                    b = y1 - x1 * k;
                    if (y3 == k * x3 + b) {
                        System.out.println("The points lie on the same line");
                    } else {
                        System.out.println("The points don't lie on the same line");
                    }
                }

                if (x1 == x2 && y1 == y2) { //Если точки А и В совпадают
                    System.out.println("The points lie on the same line, points A and B coincide");
                }

                if (x1 == x3 && y1 == y3) { //Если точки А и С совпадают

                    System.out.println("The points lie on the same line, points A and C coincide");
                }

                if (x2 == x3 && y2 == y3) { //Если точки В и С сопадают

                    System.out.println("The points lie on the same line, points B and C coincide");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Entered number doesn't match the expected type");
        }
    }
}


