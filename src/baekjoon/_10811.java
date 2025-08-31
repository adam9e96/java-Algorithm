package baekjoon;

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
        int temp = 0;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (i + 1);
        }

//        System.out.println(Arrays.toString(arr));

        // 역순으로 m 번
        for (int i = 0; i < m; i++) {

            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
//            if(a-b)
            while (a < b) {
                temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;
            }
        }
        for (int c : arr) {
            System.out.print(c + " ");
        }

    }
}