package baekjoon;

import java.util.Scanner;

/*
  2750 번 문제
  수 정렬하기
  https://www.acmicpc.net/problem/2750
 */
public class _2750 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }

        int temp = 0;
        // 오른차순 정렬 로직
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int n : arr) {
            System.out.println(n);
        }

    }
}