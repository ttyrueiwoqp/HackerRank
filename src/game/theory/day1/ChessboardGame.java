package game.theory.day1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ChessboardGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            System.out.println(x / 2 % 2 == 0 && y / 2 % 2 == 0 ? "Second" : "First");
        }
    }

}
