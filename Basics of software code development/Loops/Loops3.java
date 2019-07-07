package by.etc.loops.third_exercise;

//Найти сумму квадратов первых ста чисел.

public class Loops3 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }

        System.out.println("The sum of the squares of the first hundred numbers is " + sum);
    }
}
