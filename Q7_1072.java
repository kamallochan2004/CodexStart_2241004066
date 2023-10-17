/*
 * Name: Kamallochan Das
 * Reg No: 2241004066
 * PS LINK: https://cses.fi/problemset/task/1072/
 */

import java.util.Scanner;
public class Q7_1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for (int k = 1; k <= n; k++) {
            long ways = knight(k);
            System.out.println(ways);
        }
    }

    public static long knight(int n) {
        return (long) (n * n) * (n * n - 1) / 2 - 4 * (n - 1) * (n - 2);
    }
}