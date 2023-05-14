package homework.arrays;

import java.util.Arrays;

public class ReverseTwoArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
    }
}