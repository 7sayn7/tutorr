package homework.tertaryOperator;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
//        if (b * b > 100){
//            System.out.println(1);
//        } else {
//            System.out.println(2);
//        }
        System.out.println(b * b > 100 ? 1 : 2);
    }
}
