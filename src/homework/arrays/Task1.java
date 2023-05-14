package homework.arrays;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = numbers.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}