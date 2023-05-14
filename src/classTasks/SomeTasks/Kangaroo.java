package classTasks.SomeTasks;

import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int firstKangaroo = in.nextInt();
        int secondKangaroo = in.nextInt();
        int firstJump = in.nextInt();
        int secondJump = in.nextInt();
        if (firstJump <= secondJump) {
            System.out.println(false);
        } else {
            while (firstKangaroo < secondKangaroo) {
                firstKangaroo += firstJump;
                secondKangaroo += secondJump;
                if (firstKangaroo == secondKangaroo) {
                    System.out.println(firstKangaroo);
                    break;
                } else if (firstKangaroo > secondKangaroo) {
                    System.out.println(false);
                    break;
                }
            }
        }
    }
}
