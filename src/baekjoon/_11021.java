package baekjoon;

import java.util.Scanner;

/*
  11021 번 문제
  A+B - 7
  https://www.acmicpc.net/problem/11021
 */
public class _11021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = 0, b = 0;
        for (int i = 1; i <= number; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println("Case #" + i + ": " + (a + b));

        }
    }
}