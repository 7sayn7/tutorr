package homework.arrays;

import java.util.Scanner;

public class LocalMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        boolean chent = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[i + 1] && i == 0) {
                if (array[i] % 2 == 0) {
                    chent = true;
                }
                System.out.println(array[i]);
            } else if (array[i] > array[i - 1] && i == array.length - 1) {
                if (array[i] % 2 == 0) {
                    chent = true;
                }
                System.out.println(array[i]);
            } else if (array[i] > array[i + 1] && array[i] > array[i - 1]) {
                if (array[i] % 2 == 0) {
                    chent = true;
                }
                System.out.println(array[i]);
            }
        }
        System.out.println(chent);
    }
}