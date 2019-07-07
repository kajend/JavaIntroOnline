package by.etc.loops.sixth_exercise;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера

public class Loops6 {
    public static void main(String[] args) {

        for (int i = 0; i <= 255; i++) {
            System.out.printf("%s %c %s %d\n", "Symbol", (char) i, "\tCode", i);
        }
    }
}