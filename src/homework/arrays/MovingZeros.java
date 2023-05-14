package homework.arrays;

import java.util.Scanner;

public class MovingZeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] == 0 && array[j - 1] != 0) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
//изменить программу так, чтобы цикл закакнчивался, когда все нули перемещены в начало(без лишних действий)
//мода