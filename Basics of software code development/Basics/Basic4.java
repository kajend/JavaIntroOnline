package by.etc.basic.fourth_exercise;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

import java.util.Scanner;

public class Basic4 {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number in format NNN.DDD");

        while (scan.hasNextDouble() == false) {
            scan.next();
            System.out.println("Entered number doesn't match the expected type. Try again");
        }
        double r = scan.nextDouble();

        while (!((int) r >= 100 && (int) r <= 999)) { //Т.к. число должно быть в формате nnn.ddd,
            // то целая часть находится в диапазоне от 100 до 999
            System.out.println("Enter number in format NNN.DDD");
            r = scan.nextDouble();
        }

        System.out.println("Initial number is: " + r);

        int nnn = (int) r; //Целая часть
        double ddd = Math.round((r - nnn) * 1000); //Дробная часть
        double number = ddd + nnn / 1000.0; //Т.к. нам нужен дробный результат,
        // то делим на 1000.0, а не на 1000

        System.out.println("\nInteger part is: " + nnn +
                "\nFractional part is: " + ddd +
                "\n\nResulting number is: " + number);
    }
}
