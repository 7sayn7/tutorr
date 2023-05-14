package homework.methods;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int max1 = max(a, b);

        int a1 = in.nextInt();
        int b1 = in.nextInt();

        int max2 = max(a1, b1);

        int a2 = in.nextInt();
        int b2= in.nextInt();

        int max3 = max(a2, b2);
    }

    public static int max(int a, int b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
}
