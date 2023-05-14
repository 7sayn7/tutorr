package homework.tertaryOperator;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); // 56 / 12
        int b = in.nextInt(); // 74 / 47
//        if (a + b > 100) {
//            a = b;
//        } else {
//            b = a;
//        }
//        System.out.println(a + b);
        //System.out.println(a + b > 100 ? b + b : a + a);
        a = a + b > 100 ? b : a;
        System.out.println(a + a);
    }
}
