/*
 * Name: Kamallochan Das
 * Reg No: 2241004066
 * PS LINK: https://cses.fi/problemset/task/1094/
 */

import java.util.Scanner;

public class Q6_1094{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLong();
        }
        long moves = 0;
        for (int i = 1; i < n; i++) {
            if (array[i] < array[i - 1]) {
                moves += array[i - 1] - array[i];
                array[i] = array[i - 1];
            }
        }
        System.out.println(moves);
        sc.close();
    }
}
