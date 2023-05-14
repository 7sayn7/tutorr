package CodeForces;

import java.util.Scanner;

public class ShortSubstrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            String b = in.next();
            System.out.println(shortSubstrings(b));
        }
    }

    public static String shortSubstrings(String string) {
        String result = "";
        result = String.valueOf(string.charAt(0));
        for (int i = 1; i < string.length() - 1; i += 2) {
            result = result + String.valueOf(string.charAt(i));
        }
        result = result + String.valueOf(string.charAt(string.length() - 1));
        return result;
    }
}