package baekjoon;

import java.util.Scanner;

/*
  10952 번 문제
  A+B - 5
  https://www.acmicpc.net/problem/10952
 */
public class _10952 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        do {
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a + b != 0) {
                System.out.println(a + b);
            }
        } while (a != 0 && b != 0);

    }
}