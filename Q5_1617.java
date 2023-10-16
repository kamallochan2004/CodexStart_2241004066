/*
 * Name: Kamallochan Das
 * Reg No: 2241004066
 * PS LINK: https://cses.fi/problemset/task/1617/
 */

import java.util.Scanner;

public class Q5_1617 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        long base = 2;
        long mod = 1000000007;

        while (n > 0) {
            if (n % 2 == 1) {
                ans = (ans * base) % mod;
            }
            base = (base * base) % mod;
            n /= 2;
        }

        System.out.println(ans);
        sc.close();
    }
}
