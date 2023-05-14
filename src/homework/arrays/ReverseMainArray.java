package homework.arrays;

import java.util.Arrays;

public class ReverseMainArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}