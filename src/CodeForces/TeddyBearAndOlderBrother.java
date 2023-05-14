package CodeForces;

import java.util.Scanner;

public class TeddyBearAndOlderBrother {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int countYears = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            countYears++;
        }
        System.out.println(countYears);
    }
}