package baekjoon;

import java.util.Scanner;

/*
  8393 번 문제
  합
  https://www.acmicpc.net/problem/8393
 */
public class _8393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}