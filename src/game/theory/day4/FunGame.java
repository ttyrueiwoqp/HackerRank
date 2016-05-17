package game.theory.day4;

import java.util.*;

public class FunGame {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int[] a = new int[k];
            int[] b = new int[k];
            for (int j = 0; j < k; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < k; j++) {
                b[j] = sc.nextInt();
            }
            System.out.println(solve(a, b));
        }
    }

    private static class Item {
        int aNum;
        int bNum;

        Item(int aNum, int bNum) {
            this.aNum = aNum;
            this.bNum = bNum;
        }
    }

    private static String solve(int[] a, int[] b) {

        List<Item> list = new ArrayList<>();

        int len = a.length;
        for (int i = 0; i < len; i++) {
            list.add(new Item(a[i], b[i]));
        }
        Collections.sort(list, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return o2.aNum + o2.bNum - o1.aNum - o1.bNum;
            }
        });

        int[] sum = new int[2];
        int j = 0;
        for (Item item : list) {
            sum[j] += j == 0 ? item.aNum : item.bNum;
            j = 1 - j;
        }

        return sum[0] == sum[1] ? "Tie" : (sum[0] > sum[1] ? "First" : "Second");
    }
}
