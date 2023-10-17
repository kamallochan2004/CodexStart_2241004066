/*
 * Name: Kamallochan Das
 * Reg No: 2241004066
 * PS LINK: https://cses.fi/problemset/task/2205/
 */

import java.util.Scanner;

public class Q9_2205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        generateGrayCode(n);
    }

    public static void generateGrayCode(int n) {
        for (int i = 0; i < (1 << n); i++) {
            int gray = i ^ (i >> 1);
            String grayCode = Integer.toBinaryString(gray);
            while (grayCode.length() < n) {
                grayCode = "0" + grayCode;
            }
            System.out.println(grayCode);
        }
    }
}


