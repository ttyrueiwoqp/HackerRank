package game.theory.day2;

import java.util.Scanner;

public class NimGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int win = 0;
            for (int j = 0; j < k; j++) {
                win = win ^ sc.nextInt();
            }
            System.out.println(win != 0 ? "First" : "Second");
        }
    }
}
