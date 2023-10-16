/*
 * Name: Kamallochan Das
 * Reg No: 2241004066
 * PS LINK: https://cses.fi/problemset/task/1069/
 */

import java.util.*;
public class Q1_1069 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            int longestRepetition = repetition(input);
            System.out.println(longestRepetition);
            scanner.close();
        }
        public static int repetition(String sequence) {
            int longest = 1;
            int current = 1;
            for (int i = 1; i < sequence.length(); i++) {
                if (sequence.charAt(i) == sequence.charAt(i - 1)) {
                    current++;
                } else {
                    current = 1;
                }
                if (current > longest) {
                    longest = current;
                }
            }
            return longest;
        }
    }
