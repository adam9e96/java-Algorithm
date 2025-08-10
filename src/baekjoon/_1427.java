package baekjoon;

import java.util.Scanner;

/*
  1427 번 문제
  소트인사이드
  https://www.acmicpc.net/problem/1427
*/
public class _1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 2143
        String str = String.valueOf(n);
        int[] a = new int[str.length()];
        int temp = 0;

        for (int i = 0; i < str.length(); i++) {
            a[i] = str.charAt(i) - '0';
        }

        // 정렬
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length() - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        // 출력
        for (int i : a) {
            System.out.print(i);
        }
    }
}