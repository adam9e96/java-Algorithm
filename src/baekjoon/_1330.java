package baekjoon;

import java.util.Scanner;

/*
  1330 번 문제
  두 수 비교하기
  https://www.acmicpc.net/problem/1330
*/
public class _1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}