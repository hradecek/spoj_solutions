package com.hradecek.spoj;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

import static java.lang.String.valueOf;

public class AddRev {

    public static void main(String[] args) {
        solve(AddRev::reversedSum);
    }

    // Methods for input handling
    private static void solve(Function<String, Integer> solution) {
        final Scanner sc = new Scanner(System.in);
        int numOfCases = readNumOfCases(sc);
        while (--numOfCases >= 0) {
            System.out.println(solution.apply(sc.nextLine()));
        }
    }

    private static int readNumOfCases(Scanner sc) {
        final int numOfCases = sc.nextInt();
        sc.nextLine();
        return numOfCases;
    }

    // Actual solution
    private static int reversedSum(String line) {
        return reverse(valueOf(sum(line)));
    }

    private static int sum(String line) {
        return Arrays.stream(line.split(" "))
                    .mapToInt(AddRev::reverse)
                    .sum();
    }

    private static int reverse(String number) {
        return Integer.parseInt(new StringBuilder(number).reverse().toString());
    }
}
