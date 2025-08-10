package baekjoon;

import java.util.Scanner;

/*
  1000 번 문제
  A+B
  https://www.acmicpc.net/problem/1000
 */
public class _1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
        scanner.close();
    }
}
