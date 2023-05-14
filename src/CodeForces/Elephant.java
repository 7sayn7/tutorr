package CodeForces;

import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int elephant = 0;
        int count = 0;
        while (elephant != x) {
            if (x - elephant >= 5) {
                elephant += 5;
            } else if (x - elephant >= 4) {
                elephant += 4;
            } else if (x - elephant >= 3) {
                elephant += 3;
            } else if (x - elephant >= 2) {
                elephant += 2;
            } else if (x - elephant >= 1) {
                elephant += 1;
            }
            count++;
        }
        System.out.println(count);
    }
}