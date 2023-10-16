
/*
 * Name: Kamallochan Das
 * Reg No: 2241004066
 * PS LINK: https://cses.fi/problemset/task/1083/
 */
import java.util.*;

public class Q2_1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
        int missing = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == missing) {
                missing++;
            }
        }
        System.out.println(missing);
    }
}
