package baekjoon;

import java.util.Scanner;

/*
  25304 번 문제
  영수증
  https://www.acmicpc.net/problem/25304
 */
public class _25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int amount = scanner.nextInt();
        int sum = 0;
        int a = 0, b = 0;
        for (int i = 1; i <= amount; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            sum += (a * b);
        }
        if (sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}