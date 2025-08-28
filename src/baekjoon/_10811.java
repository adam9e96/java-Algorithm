package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

/*
  10811 번 문제
  바구니 뒤집기
  https://www.acmicpc.net/problem/10811
 */
public class _10811 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // N
        int m = sc.nextInt();

        int[] arr = new int[n];
        int temp = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = (i + 1);
        }

//        System.out.println(Arrays.toString(arr));

        // 역순으로 m 번
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
//            if(a-b)

        }

    }
}