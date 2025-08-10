package baekjoon;

import java.util.Scanner;

/*
  11022 번 문제
  A+B - 8
  https://www.acmicpc.net/problem/11022
 */
public class _11022 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int a = 0, b = 0;
        for (int i = 0; i < num; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b));
        }
    }
}