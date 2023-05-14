package homework.cycle;

import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int x = con.nextInt();
        int n = con.nextInt();
        int res = 1;
        for (int i = 0; i < n; i++) {
            res = res * x;
        }
        System.out.println(res);
    }
}