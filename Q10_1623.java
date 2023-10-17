/*
 * Name: Kamallochan Das
 * Reg No: 2241004066
 * PS LINK: https://cses.fi/problemset/task/1623/
 */
import java.util.Scanner;

public class Q10_1623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        long minDiff = difference(weights, 0, 0, 0);
        System.out.println(minDiff);
    }

    public static long difference(int[] weights, int index, long a, long b) {
        if (index == weights.length) {
            return Math.abs (a - b);
        }

        long diff1 = difference(weights, index + 1, a + weights[index], b);
        long diff2 = difference(weights, index + 1, a, b + weights[index]);

        return Math.min(diff1, diff2);
    }
}
