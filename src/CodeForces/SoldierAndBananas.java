package CodeForces;

import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int stoimost = 0;
        for (int i = 1; i <= w; i++) {
            stoimost = i * k + stoimost;
        }
        int dolg = stoimost - n;
        if (dolg >= 1) {
            System.out.println(dolg);
        } else {
            System.out.println(0);
        }
    }
}