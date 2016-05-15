package game.theory.day1;

import java.util.Scanner;

public class TowerBreakers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(solve(n, m));
        }

    }

    private static int solve(int n, int m) {
        if (m == 1) {
            return 2;
        }
        return 2 - n % 2;
    }
}
