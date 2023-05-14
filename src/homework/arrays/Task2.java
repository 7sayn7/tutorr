package homework.arrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        Scanner x = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = numbers.nextInt();
        }
        int max = array[0];
        int min = array[0];
        double sum = 0;
        double average = 0;
        int moda = 0;
        int numbersLessX = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            sum = sum + array[i];

        }

        average = sum / array.length;
        int X = x.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < X) {
                numbersLessX += 1;
            }
        }
        System.out.println("Максимальный элемент=" + max + " Минимальный элемент=" + min);
        System.out.println("Среднее арифметическое элементов=" + " " + average);
        System.out.println("Мода=" + " " + moda);
        System.out.println("Количество элементов, меньше х=" + " " + numbersLessX);
    }
}