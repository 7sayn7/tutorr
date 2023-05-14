package homework.TwoDimensionalArray;

import java.util.Random;

public class AdditionTwoMatrices {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array1 = new int[5][5];
        int[][] array2 = new int[5][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = random.nextInt(5);
                array2[i][j] = random.nextInt(5);
            }
        }
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    array1[i][j] = array1[i][j] + array2[i][j];
                }
            }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
    }
}