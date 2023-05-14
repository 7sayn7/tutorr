package homework.TwoDimensionalArray;

import java.util.Random;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] array = new int[n][n];
        int[][] array2 = new int[m][m];
        if (n == m) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = random.nextInt(20);
                    array2[i][j] = random.nextInt(20);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    array[i][j] = array[i][j] + array2[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}