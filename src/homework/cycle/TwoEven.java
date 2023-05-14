package homework.cycle;

import java.util.Scanner;

public class TwoEven {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int number = con.nextInt();

// if(number % 2 == 0 && (number / 2) % 2 == 0)
// {
// System.out.println(2 + " " + number / 2);
// }
        for (int i = 2; i <= number / 2; i++) {
            if (i % 2 == 0) {
                if (number % i == 0 && (number / i) % 2 == 0) {
                    System.out.println(i + " " + number / i);
                }
            }
        }
    }
}