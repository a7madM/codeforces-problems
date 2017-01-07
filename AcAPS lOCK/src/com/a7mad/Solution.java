package com.a7mad;


import java.util.Scanner;


/**
 * Created by a7mad on 07/01/17.
 */

// problem on CodeForces http://codeforces.com/problemset/problem/131/A
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = solution.getInput();
        String output = solution.solveProblem(input);
        System.out.println(output);
    }

    public boolean isUpperCase(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLowerCase(input.charAt(i)))
                return false;
        }
        return true;
    }


    public String solveProblem(String input) {
        if (isUpperCase(input)) {
            return input.toLowerCase();
        } else if (Character.isLowerCase(input.charAt(0)) && isUpperCase(input.substring(1))) {
            return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
        }

        return input;
    }

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return input;
    }
}
