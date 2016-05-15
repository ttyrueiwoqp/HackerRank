package game.theory.day1;

import java.util.Scanner;

public class GameOfStones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[] dp = solve(100);

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(dp[sc.nextInt()] == 1 ? "First" : "Second");
        }

    }

    private static int[] solve(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 2;
        dp[2] = dp[3] = dp[4] = dp[5] = 1;
        for (int i = 6; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 3] + dp[i - 5] > 3 ? 1 : 2;
        }
        return dp;
    }
}
