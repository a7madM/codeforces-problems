package com.a7mad;

import java.util.Scanner;

/**
 * Created by a7mad on 07/01/17.
 */

 // problem on CodeForces http://codeforces.com/problemset/problem/58/A
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = solution.takeInput();
        boolean output = solution.solveProblem(input);
        if (output) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    char[] hello = {'h', 'e', 'l', 'l', 'o'};

    public Solution() {
        System.out.println("Constructor");
    }

    public String takeInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public boolean solveProblem(String input) {
        int current_character = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (current_character == hello.length) {
                return true;
            }
            if (ch == hello[current_character] || ch == Character.toUpperCase(hello[current_character])) {
                current_character++;
            }
        }

        if (current_character == hello.length) {
            return true;
        }
        return false;
    }
}
