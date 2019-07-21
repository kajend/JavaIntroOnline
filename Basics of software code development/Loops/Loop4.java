package by.etc.loop.fourth_exercise;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class Loop4 {
    
    public static void main(String[] args) {
        
        BigInteger product = BigInteger.valueOf(1);
        //valueOf --> Returns a BigInteger whose value is equal to that of the specified long.

        for (int i = 1; i <= 200; i++) {
            product = product.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Product of squares of the first two hundred numbers is\n" + product);
    }
}
