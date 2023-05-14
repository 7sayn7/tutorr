package homework.arrays;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //объявление сканнера(нужен для ввода значения с консоли)
        int[] array = new int[in.nextInt()]; //вводится длина массива
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt(); //вводится сами элементы
        }
        int x = in.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println(i);
                break;
            }
            if (i == array.length - 1 && array[i] != x) {
                System.out.println("False");
            }
        }
    }
}