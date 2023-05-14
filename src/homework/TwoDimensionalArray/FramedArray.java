package homework.TwoDimensionalArray;

import java.util.Random;

public class FramedArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(5);
            }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (i == 0 || i == array[i].length - 1 || j == 0 || j == array[i].length - 1){
                    System.out.print(array[i][j]+ " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
