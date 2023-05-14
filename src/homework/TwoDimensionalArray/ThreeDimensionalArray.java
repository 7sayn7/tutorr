package homework.TwoDimensionalArray;

import java.util.Random;

public class ThreeDimensionalArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[][][] array = new int[6][3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    array[i][j][k] = random.nextInt(20);
                }
            }
        }
        array[0][2][0] = 6;
        array[0][2][1] = 3;
        array[0][2][2] = 15;

        boolean is = true;

        for (int i = 0; i < array.length; i++) {        // i - грань
            for (int j = 0; j < array.length; j++) {        // j - строка
                for (int k = 0; k < array.length; k++) {        // k - столбец
                    if (array[i][j][k] % 3 != 0 && j == array.length - 1) {
                        is = false;
                        break;
                    }
                    if (array[i][j][k] % 3 != 0) {
                        break;
                    }
                }
                if (is == false) {
                    break;
                }
            }
            if (is == false) {
                break;
            }
        }
        System.out.println(is);
    }
}
// проверить алгоритм, найти что не обработано, поменять.