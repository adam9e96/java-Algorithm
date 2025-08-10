package baekjoon;

import java.util.Scanner;

/*
  2439 번 문제
  구구단
  https://www.acmicpc.net/problem/2739
 */
public class _2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i=1; i <= 9; i++) {
            System.out.println(n + " * "+ i + " = " + (n * i));
        }

        scanner.close();
    }
}