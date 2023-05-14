package homework.TwoDimensionalArray;

import java.util.Random;

public class ArrayColumns {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(5);
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i]+ " ");
            }
            System.out.println();
        }
    }
}
