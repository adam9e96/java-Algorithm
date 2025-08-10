package baekjoon;
/*
  2562 번 문제
  최댓값
  https://www.acmicpc.net/problem/2562
 */

import java.util.Scanner;

public class _2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0];
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                count = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(count);

        scanner.close();
    }
}