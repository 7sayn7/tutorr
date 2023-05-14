package homework.string;

public class Practice1 {
    public static void main(String[] args) {
        //System.out.println(s1ToS2("Привет мир!", "Привет мир!"));
        System.out.println(capitalLetter("Задана строка из Нескольких слов через Пробел"));
    }

    public static boolean palindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean uniquenessChar(String string) {
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static String sort(String string) {
        String[] strings = string.split(" ");
        for (int i = strings.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (strings[j].charAt(0) > strings[j + 1].charAt(0)) {
                    String temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
        string = "";
        for (int i = 0; i < strings.length; i++) {
            string = string + strings[i] + " ";
        }
        return string;
    }

    public static boolean s1ToS2(String s1, String s2) {
        String min = null;
        String max = null;
        if (s1.length() >= s2.length()) {
            max = s1;
            min = s2;
        } else {
            max = s2;
            min = s1;
        }
        char[] charMax = new char[max.length()];
        char[] charMin = new char[min.length()];
        max.getChars(0, max.length(), charMax, 0);
        min.getChars(0, min.length(), charMin, 0);
        int count = 0;
        for (int i = 0; i < max.length(); i++) {
            if (charMin[count] == charMax[i]) {
                count++;
            } else {
                count = 0;
            }
            if (count == min.length()) {
                return true;
            }
        }
        return false;
    }

    public static int capitalLetter(String string) {
        int count = 0;
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if ((strings[i].charAt(0) >= 'А') && (strings[i].charAt(0) <= 'Я')) {
                count++;
            }
        }
        return count;
    }
}