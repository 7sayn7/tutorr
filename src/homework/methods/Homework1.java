package homework.methods;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //int b = in.nextInt();
        //int c = in.nextInt();
        //System.out.println(otrezok(a, b, c));
        //System.out.println(razryad(a));
        int[] array = {4, 2, 8, 12, 5, 1};
        //System.out.println(Arrays.toString(bubbleSort(array)));
        //System.out.println(Arrays.toString(insertionSort(array)));
        System.out.println(averageValue(array));
    }

    public static boolean lineSegment(int a, int b, int c) {
        if (a <= c && c <= b) {
            return true;
        } else {
            return false;
        }
    }

    public static int discharge(int a) {
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static double averageValue(int[] array) {
        double a = 0;
        for (int i = 0; i < array.length; i++) {
            a += array[i];
        }
        double average = a / array.length;
        return average;
    }
}