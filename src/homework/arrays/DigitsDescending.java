package homework.arrays;

import java.util.Scanner;

public class DigitsDescending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[in.nextInt()];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                count += 1;
                continue;
            }
            while (array[i] > 9) {
                if (array[i] % 10 < (array[i] % 100) / 10) {
                    array[i] = array[i] / 10;
                } else {
                    break;
                }
                if (array[i] <= 9) {
                    count += 1;
                }
            }
        }
        if (count == 3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
