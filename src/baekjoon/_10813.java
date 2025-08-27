package baekjoon;

import java.util.Scanner;

/*
  10813 번 문제
  공 바꾸기
  https://www.acmicpc.net/problem/10813
 */
public class _10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
        int m = sc.nextInt(); // 4

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

//        System.out.println(Arrays.toString(arr));
        int temp = 0;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(); // i
            int b = sc.nextInt(); // j

            temp = arr[a - 1];
            arr[a - 1] = arr[b - 1];
            arr[b - 1] = temp;

        }

        for (int c : arr) {
            System.out.print(c + " ");
        }
    }
}