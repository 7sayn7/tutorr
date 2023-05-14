package homework.tertaryOperator;

import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
//        if (s.equals("Hello")) {
//            System.out.println(1);
//        } else {
//            System.out.println(2);
//        }
        System.out.println(Objects.equals(s, "Hello") ? 1 : 0);
    }
}