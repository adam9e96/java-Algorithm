package baekjoon;

import java.util.Scanner;

/*
  2438 번 문제
  별 찍기 - 1
  https://www.acmicpc.net/problem/2438
 */
public class _2438 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}