/*
 * Name: Kamallochan Das
 * Reg No: 2241004066
 * PS LINK: https://cses.fi/problemset/task/1083/
 */
import java.util.*;
public class Q3_1618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        sc.close();
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        System.out.println(count);
    }
}
