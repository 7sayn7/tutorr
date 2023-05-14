package pojects;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static final char symbolX = 'x';
    static final char symbolO = 'o';
    static final char symbolNothing = '.';
    static char[][] table;
    static Random random;
    static Scanner scanner;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }

    public static void game() {
        tableInitialization();
        while (true) {
            humanMove();
            if (checkVictory(symbolX)) {
                System.out.println("Ты победил!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            AiMove();
            printTable();
            if (checkVictory(symbolO)) {
                System.out.println("AI победил!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("Игра закончена.");
        printTable();
    }

    public static void tableInitialization() {
        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 3; column++) {
                table[line][column] = symbolNothing;
            }
        }
    }

    public static void printTable() {
        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 3; column++) {
                System.out.println(table[line][column] + " ");
                System.out.println();
            }
        }
    }

    public static void humanMove() {
        int x, y;
        do {
            System.out.println("Введите X и Y:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
    }

    public static boolean isCellValid(int x, int y) {

        if (x < 0 || y < 0 || x >= 3 || y >= 3) {
            return false;
        }
        return table[y][x] == symbolNothing;
    }

    public static void AiMove() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[y][x] = symbolO;
    }

    public static boolean checkVictory(char dot) {
        for (int i = 0; i < 3; i++)
            if ((table[i][0] == dot && table[i][1] == dot &&
                    table[i][2] == dot) ||
                    (table[0][i] == dot && table[1][i] == dot &&
                            table[2][i] == dot))
                return true;
        if ((table[0][0] == dot && table[1][1] == dot &&
                table[2][2] == dot) ||
                (table[2][0] == dot && table[1][1] == dot &&
                        table[0][2] == dot))
            return true;
        return false;
    }

    static boolean isTableFull() {
        for (int line = 0; line < 3; line++) {
            for (int column = 0; column < 3; column++) {
                if (table[line][column] == symbolNothing)
                    return false;
            }
        }
        return true;
    }
}