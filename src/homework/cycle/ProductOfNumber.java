package homework.cycle;

import java.util.Scanner;

public class ProductOfNumber {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);

        int number = con.nextInt();
        int result = 1;
        while (number > 0) {
            result = result * (number % 10);
            number /= 10;
        }

        if (result % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

    }
}