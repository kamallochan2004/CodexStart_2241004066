/*
 * Name: Kamallochan Das
 * Reg No: 2241004066
 * PS LINK: https://cses.fi/problemset/task/2165/
 */
import java.util.*;

public class Q8_2165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int moves = (int) Math.pow(2, n) - 1;
        System.out.println(moves);
        towerOfHanoi(n, 1, 3, 2);
    }

    public static void towerOfHanoi(int n, int a, int b, int c) {
        if (n == 1) {
            System.out.println(a + " " + b);
            return;
        }

        towerOfHanoi(n - 1, a, c, b);
        System.out.println(a + " " + b);
        towerOfHanoi(n - 1, c, b, a);
    }
}