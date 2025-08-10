package baekjoon;

import java.util.Scanner;

/*
  10951 번 문제
  A+B - 4
  https://www.acmicpc.net/problem/10951
 */
public class _10951 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        while (scanner.hasNextInt()) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a + b);
        }
        scanner.close();
    }
}