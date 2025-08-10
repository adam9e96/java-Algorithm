package baekjoon;

import java.util.Scanner;

/*
  10818 번 문제
  최소, 최대
  https://www.acmicpc.net/problem/10818
 */
public class _10818 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrays = new int[n];
        int min = 0, max = 0;

        for (int i = 0; i < n; i++) {
            arrays[i] = scanner.nextInt();
            if (i == 0) {
                min = arrays[0];
                max = arrays[0];
            }

            if (min > arrays[i]) {
                min = arrays[i];
            }
            if (max < arrays[i]) {
                max = arrays[i];
            }
        }
        System.out.println(min + " " + max);
    }
}