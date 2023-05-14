package homework.cycle;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        int m = con.nextInt();
        int a = con.nextInt();
        int length = 0;
        int weight = 0;
        int countLenght = 0;
        int countWeight = 0;
        if (a > 0 && n > 0 && m > 0) {
            while (n > length) {
                countLenght++;
                length += a;
            }
            while (m > weight) {
                countWeight++;
                weight += a;
            }
            System.out.println(countLenght * countWeight);
        }
    }
}