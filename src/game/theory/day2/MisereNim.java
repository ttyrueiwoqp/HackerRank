package game.theory.day2;

import java.util.Scanner;

public class MisereNim {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int win = 0;
            boolean f = false;
            for (int j = 0; j < k; j++) {
                int m = sc.nextInt();
                if (m >= 2) {
                    f = true;
                }
                win = win ^ m;
            }
            System.out.println((win != 0 && f) || win == 0 && !f ? "First" : "Second");
        }
    }
}
